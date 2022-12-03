package _1;

public class Plate extends Dish{
    private float diameter;

    public Plate(String name, float diameter) {
        super(name);
        this.diameter = diameter;
    }

    public void Crash()
    {
        System.out.println(name + " разбита!");
    }
}
