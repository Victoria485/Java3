package Homework1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Box<F extends Fruit>
{
    private List<F> fruits;
    public Box(F... fruits) { this.fruits = new ArrayList<>(Arrays.asList(fruits)); }
    public float getWeight()
    {
        float weight = 0;
        for (F fruit : fruits) { weight += fruit.getWeight(); }
        return weight;
    }
    public boolean compare(Box another)
    {
        return this.getWeight() == another.getWeight();
    }
    public void transferFruits(Box another)
    {
        another.fruits.addAll(fruits);
        fruits.clear();
    }
    public void add(F fruit) { this.fruits.add(fruit); }
}