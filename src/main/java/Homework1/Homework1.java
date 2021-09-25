package Homework1;
import java.util.ArrayList;
import java.util.Arrays;
public class Homework1
{
    public static void main(String[] args)
    {
        String[] arr = {"a","b","c","d","e"};
        changeElements(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
        System.out.println(fromArrayToArrayList(arr));
        Box boxWithApples = new Box(new Apple(), new Apple(), new Apple());
        Box boxWithOranges = new Box(new Orange(), new Orange());
        System.out.println(boxWithApples.getWeight());
        System.out.println(boxWithOranges.getWeight());
        System.out.println(boxWithOranges.compare(boxWithApples));
        Box boxWithApples2 = new Box(new Apple());
        boxWithApples2.add(new Apple());
        System.out.println(boxWithApples2.getWeight());
        boxWithApples.transferFruits(boxWithApples2);
        System.out.println(boxWithApples.getWeight());
        System.out.println(boxWithApples2.getWeight());
    }
    private static <T> void changeElements (T[] arr, int i1, int i2)
    {
        T t = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = t;
    }
    private static <T> ArrayList<T> fromArrayToArrayList (T[] arr)
    {
        return new ArrayList<T>(Arrays.asList(arr));
    }
}