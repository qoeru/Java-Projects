package com.example;

public class Tester {
    public static void main(String[] args){
        Shape shape = new Shape("квадрат", 24);
        System.out.println(shape);
        Circle circle = new Circle("circle", 3);
        System.out.println(circle);
        Book book = new Book("Гарри Потер", 500);
        System.out.println(book);
    }
}
