package com.company;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age is not correct for a dog: ");
        } else
            this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 0) {
            System.out.println("Weight is not correct for a dog: ");
        } else
            this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void dogMethod(String name) {
        System.out.println(name + " loves to run");
    }

}
