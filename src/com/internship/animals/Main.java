package com.internship.animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Buddy", 3, "Labrador"),
            new Cat("Luna", 2, true),
            new Dog("Max", 5, "German Shepherd"),
            new Cat("Milo", 1, false)
        };

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            System.out.println();
        }
    }
}
