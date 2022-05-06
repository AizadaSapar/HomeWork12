package com.company;

public class Cat {
    private String name;
    private int age;
    private String color;
    private int feet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age < 0) {
            System.out.println("Age is not correct fo a cat: ");
        } else
            this.age = age;

    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public int getFeet() {
        return feet;
    }

    void setFeet(int feet) {
        this.feet = feet;
    }

    void catMethod(String name) {
        System.out.println(name + " " + "Loves  to catch mice! ");
    }
}







