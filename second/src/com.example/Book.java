package com.example;

public class Book {
    private String name;
    private int length;

    public Book(String name, int length){
        this.name = name;
        this.length = length;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLength(int length){
        this.length = length;
    }

    @Override
    public String toString(){
        return "Книга: {" + '\n'
                + "название = " + name + '\n' +
                "количество страниц = " + length + '\n' +
                '}';
    }
}
