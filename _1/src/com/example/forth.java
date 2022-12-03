package com.example;
import java.util.Random;
import java.util.Arrays;

//случайные числа ([0, 100]) двумя методами
public class forth {
    public static void printArray(int[] a, int len){
        for(int i = 0; i < len; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println("Первый способ");
        for(int i = 0; i < 5; i++) {
            a[i] = (int) (Math.random() * 101);
        }
        printArray(a, 5);
        Arrays.sort(a);
        printArray(a, 5);

        System.out.println("Второй способ");
        Random rnd = new Random();

        for(int i = 0; i < 5; i++) {
            a[i] = rnd.nextInt(100) + 1;
        }
        printArray(a, 5);
        Arrays.sort(a);
        printArray(a, 5);
    }
}
