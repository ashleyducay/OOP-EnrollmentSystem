package org.example.module;

public class Instructor {
    private String instructorID;
    private String instructorName;
    private String courses;

    public Instructor(String instructorID, String instructorName, String courses){
        this.instructorID = instructorID;
        this.instructorName = instructorName;
        this.courses = courses;
    }

    public String getInstructorID(){
        return instructorID;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getCourses() {
        return courses;
    }

    public void setInstructorID(String instructorID) {
        this.instructorID = instructorID;
    }

    public void setInstructorName(String instructorName){
        this.instructorName = instructorName;
    }

    public void setCourses(String courses){
        this.courses = courses;
    }
}