package _1;

public class Cup extends Dish
{
    private float volume;

    public Cup(String name, float volume)
    {
        super(name);
        this.volume = volume;
    }

    public void Empty()
    {
        System.out.println(name + " опустошена!");
    }
}
