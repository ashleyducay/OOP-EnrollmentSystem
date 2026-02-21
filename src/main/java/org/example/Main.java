package org.example;

import org.example.model.Person;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Charlie", 30);
        Person p3 = new Person("David", 22);

        ArrayList<Person> personList = new ArrayList<>();

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(new Person("Crayl", 19));

        for (Person p : personList) {
            System.out.println("Name: " + p.getName());
            System.out.println("Age: " + p.getAge());
            System.out.println();
        }

        personList.get(1).setName("Bob the Builder");
        personList.get(0).setAge(47);

        personList.remove(0);

        for (Person p : personList) {
            System.out.println("Name: " + p.getName());
            System.out.println("Age: " + p.getAge());
            System.out.println();
        }
    }
}