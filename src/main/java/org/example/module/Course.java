package org.example.model;

public class Course {

    private String courseID;
    private String courseName;
    private String program;

    public Course() {
        this("00000", "Unknown", "Unknown");
    }

    public Course(String courseID, String courseName, String program) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.program = program;
    }

    public String getCourseID() { return courseID; }
    public void setCourseID(String courseID) { this.courseID = courseID; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getProgram() { return program; }
    public void setProgram(String program) { this.program = program; }

    public void display() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Name: " + courseName);
        System.out.println("Program: " + program);
        System.out.println();
    }
}
