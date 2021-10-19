package Homework7;

public class MethodsForTest {
    public static void method0() {
        System.out.println("Method0");
    }
    @BeforeSuite
    public static void method1() {
        System.out.println("Method1");
    }
    @Test(priority = 1)
    public static void method2() {
        System.out.println("Method2");
    }
    @Test(priority = 5)
    public static void method3() {
        System.out.println("Method3");
    }
    @Test(priority = 10)
    public static void method4() {
        System.out.println("Method4");
    }
    @AfterSuite
    public static void method5() {
        System.out.println("Method5");
    }
}
