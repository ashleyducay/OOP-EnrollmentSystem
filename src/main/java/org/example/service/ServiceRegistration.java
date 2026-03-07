package org.example.service;

import org.example.model.Student;
import java.util.ArrayList;

public class ServiceRegistration {
    private ArrayList<Student> studentList = new ArrayList<>();

    // Add student
    public void addStudent(Student student){
        studentList.add(student);
    }

    // Display all students
    public void displayAll(){
        if(studentList.isEmpty()){
            System.out.println("No students registered.");
            return;
        }
        for(Student s : studentList){
            s.display();
        }
    }

    // Update student by ID
    public void updateStudent(Student student){
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getPersonID().equals(student.getPersonID())){
                studentList.set(i, student);
                break;
            }
        }
    }

    // Remove student by ID
    public void deleteStudent(Student student){
        studentList.removeIf(s -> s.getPersonID().equals(student.getPersonID()));
    }

    // Find student by ID
    public Student findStudentByID(String studentID){
        for(Student s : studentList){
            if(s.getPersonID().equals(studentID)){
                return s;
            }
        }
        return null;
    }
}