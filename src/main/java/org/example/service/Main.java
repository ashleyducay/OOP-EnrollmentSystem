package org.example.service;

import org.example.model.Student;
import org.example.model.Course;
import org.example.model.Instructor;

public class Main {

    public static void main(String[] args) {

        ServiceRegistration sr = new ServiceRegistration();

        Student s1 = new Student("IT");
        s1.setPersonID("000123");
        s1.setPersonName("Alice");

        Student s2 = new Student("CS");
        s2.setPersonID("000124");
        s2.setPersonName("Bob");



        CourseRegistration cr = new CourseRegistration();

        Course c1 = new Course("C001","Integrative Programming","IT");
        Course c2 = new Course("C002","Data Structures","CS");

        cr.saveCourse(c1);
        cr.saveCourse(c2);

        cr.displayAllCourse();


        Instructor i1 = new Instructor("I001","Trish","Integrative Programming");
        Instructor i2 = new Instructor("I002","Keziah","Data Structures");

        System.out.println("\nInstructor List");

        System.out.println(i1.getPersonID()+" "+i1.getPersonName()+" "+i1.getCourses());
        System.out.println(i2.getPersonID()+" "+i2.getPersonName()+" "+i2.getCourses());
    }
}