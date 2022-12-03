package _1;

public abstract class Dish {
    protected String name;

    public Dish(String name) {
        this.name = name;
    }

    public void Wash()
    {
        System.out.println(name + " помыт(a)!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
