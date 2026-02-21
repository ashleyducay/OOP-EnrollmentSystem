package org.example.service;

import org.example.model.Person;
import java.util.ArrayList;

public class PersonEnrollment {

    private ArrayList<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void displayALL() {
        for (Person p : personList) {
            p.display();
        }
    }

    public void updatePerson(Person person) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().equals(person.getName())) {
                personList.set(i, person);
                break;
            }
        }
    }

    public void deletePersonRecord(Person person) {
        personList.removeIf(p -> p.getName().equals(person.getName()));
    }
}