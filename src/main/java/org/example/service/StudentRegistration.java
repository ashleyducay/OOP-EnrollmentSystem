package org.example.service;

import org.example.model.Student;
import java.util.ArrayList;

public class StudentRegistration implements StudentReg {
    private ArrayList<Student> studentList = new ArrayList<>();

    @Override
    public void saveStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void displayAllStudent() {
        if (studentList.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }
        for (Student s : studentList) {
            s.display();
        }
    }

    @Override
    public void updateStudent(Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getPersonID().equals(student.getPersonID())) {
                studentList.set(i, student);
                break;
            }
        }
    }

    @Override
    public String removeStudent(Student student) {
        boolean removed = studentList.removeIf(s -> s.getPersonID().equals(student.getPersonID()));
        return removed ? "Success" : "Not Found";
    }

    @Override
    public Student findStudentByID(String studentID) {
        for (Student s : studentList) {
            if (s.getPersonID().equals(studentID)) {
                return s;
            }
        }
        return null;
    }
}