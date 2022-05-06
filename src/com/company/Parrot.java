package com.company;

public class Parrot {
    private String name;
    private int age;
    private int clean;
    private String color;

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age < 0) {
            System.out.println("Wrong age ");
        } else
            this.age = age;
    }

    public int getClean() {
        return clean;
    }

    void setClean(int clean) {
        this.clean = clean;
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    void ParrotMethod(String name) {
        System.out.println("Parrot can speak! ");
    }


}
