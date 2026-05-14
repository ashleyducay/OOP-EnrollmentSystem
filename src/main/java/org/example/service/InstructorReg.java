package org.example.service;

import org.example.model.Instructor;
import org.example.model.Section;
import java.util.List;

public interface InstructorReg {
    void save(Instructor instructor);
    void displayAll();
    void updateInstructor(String id, Instructor updated);
    Instructor findByID(String id);
    void deleteInstructor(String id);
    void assignInstructorToSection(Instructor instructor, Section section);
    void displayInstructorDetails();
}