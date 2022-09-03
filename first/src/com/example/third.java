package com.example;
//первые десять чисел гармонического ряда
public class third {
    public static void main(String[] args) {
        float temp = 0;
        for(int i = 1; i <= 10; i++){
            temp += (float) 1 / i;
            System.out.println(temp);
        }
    }
}
