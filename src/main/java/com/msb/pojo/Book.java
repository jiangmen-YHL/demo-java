package com.msb.pojo;

public class Book {
    private int id;
    private String name;
    private String author;
    private double price;

    public Book() {
        System.out.println("空");
    }

    public Book(int id, String name, String author, double price) {
        System.out.println("有");
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("我到了");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("我又到了");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
