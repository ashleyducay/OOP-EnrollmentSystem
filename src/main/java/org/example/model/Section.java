package org.example.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Section {

    private String sectionName;
    private int maxCapacity;
    private List<Student> enrolledStudents;


    private Instructor instructor;
    private Course course;


    public Section(String sectionName, int maxCapacity, Instructor instructor, List<Student> enrolledStudents) {
        this.sectionName = sectionName;
        this.maxCapacity = maxCapacity;
        this.instructor = instructor;

        this.enrolledStudents = (enrolledStudents != null) ? enrolledStudents : new ArrayList<>();
    }


    public String getInstructorInCharge() {
        if (this.instructor != null) {
            return this.instructor.getPersonName(); // <--- Itinama na rito kanina
        }
        return "No Instructor Assigned";
    }


    public void setCourse(Course course) {
        this.course = course;
    }


    public Course getCourse() {
        return course;
    }


    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }


    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return sectionName +
                " | Course: " + (course != null ? course.getCourseName() : "N/A") +
                " | Instructor: " + (instructor != null ? instructor.getPersonName() : "None") + // <--- BAGONG FIX: Itinama na rin dito!
                " (" + enrolledStudents.size() + "/" + maxCapacity + ")";
    }


    @SuppressWarnings("unchecked")
    public Collection<Object> getStudentList() {
        return (Collection<Object>) (Collection<?>) enrolledStudents;
    }
}