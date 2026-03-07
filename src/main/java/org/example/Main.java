package org.example;

import org.example.model.Student;
import org.example.model.Course;
import org.example.module.Instructor;
import org.example.service.ServiceRegistration;
import org.example.service.CourseRegistration;

public class Main {

    public static void main(String[] args) {

        ServiceRegistration serviceRegistration = new ServiceRegistration();

        Student s1 = new Student("000123", "Alice", "IT");
        Student s2 = new Student("000124", "Bob", "CS");
        Student s3 = new Student("000125", "Charlie", "IT");

        serviceRegistration.addStudent(s1);
        serviceRegistration.addStudent(s2);
        serviceRegistration.addStudent(s3);

        s1.display();
        s2.display();
        s3.display();

        Student updatedStudent = new Student("000123", "Alice", "Software Engineering");
        serviceRegistration.updateStudent(updatedStudent);

        updatedStudent.display();

        serviceRegistration.deleteStudent(updatedStudent);

        CourseRegistration courseRegistration = new CourseRegistration();

        Course c1 = new Course("C001", "Integrative Programming", "IT");
        Course c2 = new Course("C002", "Data Structures", "CS");

        courseRegistration.addCourse(c1);
        courseRegistration.addCourse(c2);

        c1.display();
        c2.display();

        Course updatedCourse = new Course("C001", "Advanced Integrative Programming", "IT");
        courseRegistration.updateCourse(updatedCourse);

        updatedCourse.display();

        courseRegistration.deleteCourse(c2);

        Instructor i1 = new Instructor("I001", "Trish", "IT");
        Instructor i2 = new Instructor("I002", "Keziah", "CS");
        Instructor i3 = new Instructor("I003", "Ashley", "IT");

        System.out.println(i1.getInstructorID() + " " + i1.getInstructorName() + "  " + i1.getCourses());
        System.out.println(i2.getInstructorID() + " " + i2.getInstructorName() + "  " + i2.getCourses());
        System.out.println(i3.getInstructorID() + " " + i3.getInstructorName() + "  " + i3.getCourses());




    }
}