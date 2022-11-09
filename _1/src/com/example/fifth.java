package com.example;
import java.util.Scanner;
// факториал числа
public class fifth {
    public static int fact(int a) {
        int n = 1;
        for(int i = 1; i <= a; i++) {
            n = n * i;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число.");
        int n = scanner.nextInt();
        System.out.println(fact(n));
    }
}
