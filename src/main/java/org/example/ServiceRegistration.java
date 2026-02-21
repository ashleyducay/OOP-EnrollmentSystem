package org.example.service;

import org.example.model.Student;
import java.util.ArrayList;

public class ServiceRegistration {

    private ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void displayAll() {
        for (Student s : studentList) {
            s.display();
        }
    }

    public void updateStudent(Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentID().equals(student.getStudentID())) {
                studentList.set(i, student);
                break;
            }
        }
    }

    public void deleteStudent(Student student) {
        studentList.removeIf(s -> s.getStudentID().equals(student.getStudentID()));
    }
}
