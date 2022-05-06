package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(2);
        dog.setName("Bob");
        dog.setColor("Blu");
        dog.setWeight(5);

        System.out.println("Dog name's: " + dog.getName() + "\n" + "Dog age's: " + dog.getAge() + "\n" + "Dog's color:" + dog.getColor() + "\n" + "Dog's wight: " + dog.getWeight());
        dog.dogMethod(dog.getName());
        System.out.println("-----------------");

        Cat cat = new Cat();
        cat.setName("Mia");
        cat.setAge(1);
        cat.setColor("white");
        cat.setFeet(2);
        System.out.println("This cat's name " + cat.getName() + "\n" + cat.getAge() + " yeas old" + "\n" + "She's   " + cat.getColor() + "\n" + cat.getFeet() + "eats a day ");
        cat.catMethod(cat.getName());
        System.out.println("----------------");

        Parrot parrot = new Parrot();
        parrot.setName("Karl");
        parrot.setAge(5);
        parrot.setClean(1);
        parrot.setColor("Colorful");
        System.out.println("This is " + parrot.getName() + ".\n" + "Hi is very " + parrot.getColor() + "bird.\n" + "Hi lives in the city " + parrot.getAge() + " " + "years." + "\n" + "Bird cleans it swings" + " " + parrot.getClean() + " " + "a day.");
        parrot.ParrotMethod(parrot.getName());
        System.out.println("---------------");

        Fish fish = new Fish();
        fish.setType("Tuna");
        fish.setWeight(1);
        fish.setPiece(5);
        fish.fishMethod(fish.getType());
        System.out.println("I wont to buy this " + fish.getType() + "\n" + "Please " + fish.getPiece() + " piece." + "\n" + "Please it is your order " + fish.getWeight() + " weight.");


    }

}

