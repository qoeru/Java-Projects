package com.example;
//вывод аргументов командной строки
public class second {
    public static void main(String[] args) {
        for(String str : args){
            System.out.println("Аргумент: " + str);
        }

    }
}
