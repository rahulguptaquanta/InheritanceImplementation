package com.internship.animals;

public class Cat extends Animal {
    private boolean indoor;

    public Cat(String name, int age, boolean indoor) {
        super(name, age);
        this.indoor = indoor;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Indoor pet: " + (indoor ? "Yes" : "No"));
    }
}
