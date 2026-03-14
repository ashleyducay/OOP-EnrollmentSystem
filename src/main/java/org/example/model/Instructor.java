package org.example.model;

public class Instructor extends Person {
    private String courses;


    public Instructor(String personID, String personName, String courses){
        super(personID, personName);
        this.courses = courses;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public void display() {
        System.out.println("Instructor ID: " + getPersonID());
        System.out.println("Instructor Name: " + getPersonName());
        System.out.println("Courses: " + getCourses());
        System.out.println("---------------------------------");
    }

    @Override
    public void mainTask() {

    }
}