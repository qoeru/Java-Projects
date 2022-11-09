package com.example;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void trans(){
        this.age *= 8;
    }

    @Override
    public String toString(){
        return "Dog: {" + '\n'
                + "Кличка = " + name + '\n' +
                "Возраст = " + age + '\n' +
                '}';
    }
}


