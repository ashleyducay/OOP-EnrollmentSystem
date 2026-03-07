package org.example.model;

public class Dog extends Animal {

    @Override
    public void makeSound(){
        System.out.println("Dog Barks!");
    }

    public void displayAge(){
        System.out.println(super.age);
    }
}
