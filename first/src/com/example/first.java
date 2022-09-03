package com.example;
import java.util.Scanner;
// сумма целочисленного массива м помощью for, while, do while
public class first {
    public static int sumFor(int[] a, int len){
        int sum = 0;
        for(int i = 0; i < len; i++)
            sum += a[i];
        return sum;
    }

    public static int sumWhile(int[] a, int len){
        int sum = 0;
        while(len > 0) {
            sum += a[len - 1];
            len--;
        }
        return sum;
    }
    public static int sumDoWhile(int[] a, int len){
        int sum = a[0];
        do{
            sum += a[len - 1];
            len--;
        } while (len > 1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов массива.");
        int len = scanner.nextInt();

        int[] arr = new int[len];

        for(int i = 0; i < len; i++){
            int temp = i + 1;
            System.out.println("Введите элемент " + temp + ".");
            arr[i] = scanner.nextInt();
        }

        System.out.println(sumFor(arr, len));
        System.out.println("check1");
        System.out.println(sumWhile(arr, len));
        System.out.println("check2");
        System.out.println((sumDoWhile(arr, len)));
        System.out.println("check3");


    }
}
