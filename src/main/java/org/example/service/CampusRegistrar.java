package org.example.service;

import org.example.model.Student;
import org.example.model.Course;

public class CampusRegistrar {
    private StudentReg studentRegistration;
    private CourseReg courseReg;

    public CampusRegistrar(StudentReg studentRegistration, CourseReg courseReg) {
        this.studentRegistration = studentRegistration;
        this.courseReg = courseReg;
    }

    public String saveStudent(Student student) {
        studentRegistration.saveStudent(student);
        return "Success";
    }

    public String displayAllStudent() {
        studentRegistration.displayAllStudent();
        return "Success";
    }

    public String updateStudent(Student student) {
        studentRegistration.updateStudent(student);
        return "Success";
    }

    public String saveCourse(Course course) {
        courseReg.saveCourse(course);
        return "Success";
    }
}