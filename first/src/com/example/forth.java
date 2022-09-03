package com.example;
import java.util.Random;
//случайные числа ([0, 100]) двумя методами
public class forth {
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println("Первый способ");
        for(int i = 0; i < 5; i++) {
            a[i] = (int) (Math.random() * 101);
            System.out.println(a[i]);
        }

        System.out.println("Второй способ");
        Random rnd = new Random();

        for(int i = 0; i < 5; i++) {
            a[i] = rnd.nextInt(100) + 1;
            System.out.println(a[i]);
        }
    }
}
