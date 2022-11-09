package com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class DogsNursery {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество собак");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите имя собаки");
            String name = scanner.next();
            System.out.println("Введите возраст собаки");
            int age = scanner.nextInt();
            dogs.add(new Dog(name, age));
            System.out.println(dogs.get(i));
        }
    }
}
