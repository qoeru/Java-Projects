package _2;

public abstract class Dog {
    protected String name;
    protected int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void Bark()
    {
        System.out.println(name + " говорит: \"Гав!\"");
    }
}
