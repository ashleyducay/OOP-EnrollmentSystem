package org.example.service;

import org.example.model.Course;
import java.util.ArrayList;

public class CourseRegistration {

    private ArrayList<Course> courseList = new ArrayList<>();

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void displayAll() {
        for (Course c : courseList) {
            c.display();
        }
    }

    public void updateCourse(Course course) {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseID().equals(course.getCourseID())) {
                courseList.set(i, course);
                break;
            }
        }
    }

    public void deleteCourse(Course course) {
        courseList.removeIf(c -> c.getCourseID().equals(course.getCourseID()));
    }
}
