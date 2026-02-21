package org.example.model;

public class Student {

    private String studentID;
    private String studentName;
    private String program;

    public Student() {
        this("000000", "Unknown", "Unknown");
    }

    public Student(String studentID, String studentName, String program) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.program = program;
    }

    public String getStudentID() { return studentID; }
    public void setStudentID(String studentID) { this.studentID = studentID; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getProgram() { return program; }
    public void setProgram(String program) { this.program = program; }

    public void display() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Program: " + program);
        System.out.println();
    }
}
