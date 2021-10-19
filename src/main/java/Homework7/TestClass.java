package Homework7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestClass {
    public static void start(Class<?> c) throws InvocationTargetException, IllegalAccessException {
        Method beforeSuite = null;
        Method afterSuite = null;
        Method[] methods = c.getDeclaredMethods();
        List<Method> list = new ArrayList<>();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                list.add(method);
            }
            if (method.isAnnotationPresent(BeforeSuite.class)) {
                if (beforeSuite != null) throw new RuntimeException("only one BeforeSuite needed");
                beforeSuite = method;
            }
            if (method.isAnnotationPresent(AfterSuite.class)) {
                if (afterSuite != null) throw new RuntimeException("only one AfterSuite needed");
                afterSuite = method;
            }
        }
        list.sort(Comparator.comparingInt(method -> method.getAnnotation(Test.class).priority()));
        if (beforeSuite != null) list.add(0, beforeSuite);
        if (afterSuite != null) list.add(afterSuite);
        for (Method method : list) {
            method.invoke(null);
        }
    }
}
