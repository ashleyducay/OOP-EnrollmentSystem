package org.example.service;

import org.example.model.Instructor;
import org.example.model.Section;
import java.util.ArrayList;
import java.util.List;

public class InstructorRegistration implements InstructorReg {
    private List<Instructor> instructors = new ArrayList<>();

    @Override
    public void save(Instructor instructor) {
        instructors.add(instructor);
    }

    public void displayAll() {
        for (Instructor i : instructors) {
            System.out.println("ID: " + i.getPersonID() + " | Name: " + i.getPersonName());
        }
    }

    public void updateInstructor(String id, Instructor updated) {
        Instructor existing = findByID(id);
        if (existing != null && updated != null) {
            existing.setSpecialization(updated.getSpecialization());
        }
    }

    public Instructor findByID(String id) {
        for (Instructor i : instructors) {
            if (i.getPersonID().equalsIgnoreCase(id)) return i;
        }
        return null;
    }

    public void removeInstructor(String id) {
        instructors.removeIf(i -> i.getPersonID().equalsIgnoreCase(id));
    }

    public void deleteInstructor(String id) {
        instructors.removeIf(i -> i.getPersonID().equalsIgnoreCase(id));
    }

    public void assignInstructorToSection(Instructor i, Section s) {
        if (s != null && i != null) {
            s.setInstructor(i);
        }
    }

    public void displayInstructorDetails() {
        displayAll();
    }

    public Instructor findInstructorById(String id) {
        return findByID(id);
    }
}