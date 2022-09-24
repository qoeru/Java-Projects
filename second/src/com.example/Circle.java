package com.example;

public class Circle {
    private String name;
    private int radius;
    private int diameter;

    public Circle (String n_name, int n_radius){
        name = n_name;
        radius = n_radius;
        diameter = n_radius * 2;
    }

    public void setName(String n_name) {
        name = n_name;
    }

    public void setRadius(int n_radius){
        radius = n_radius;
        diameter = n_radius * 2;
    }

    @Override
    public String toString(){
        return "Circle: {" + '\n'
                + "name = " + name + '\n' +
                "radius = " + radius + '\n' +
                "diameter = " + diameter + '\n' +
                '}';
    }
}
