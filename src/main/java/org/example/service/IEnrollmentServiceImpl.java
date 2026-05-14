package org.example.service;

import org.example.model.Department;
import org.example.model.Section;
import org.example.model.Student;
import java.util.List;


public class IEnrollmentServiceImpl implements IEnrollmentService {

    @Override
    public void enrollStudentInSection(Section section, Student student) {
        if (section.getEnrolledStudents().size() < section.getMaxCapacity()) {
            section.getEnrolledStudents().add(student);
            System.out.println("System: " + student.getPersonName() + " successfully added to " + section.getSectionName());
        } else {
            System.out.println("System Error: Section has reached maximum capacity.");
        }
    }

    public void viewDepartmentHierarchy() {
        viewDepartmentHierarchy(null);
    }

    @Override
    public void viewDepartmentHierarchy(List<Department> allDepartments) {
        System.out.println("\n========== INSTITUTIONAL HIERARCHY ==========");
        for (Department department : allDepartments) {
            System.out.println("\nDepartment: " + department.getDepartmentTitle());

            if (department.getSectionList().isEmpty()) {
                System.out.println("   └── No sections available");
                continue;
            }

            for (Section section : department.getSectionList()) {
                String instructorName = (section.getInstructor() != null)
                        ? section.getInstructor().getPersonName()
                        : "TBA";

                System.out.println("   └── Section: " + section.getSectionName() + " | Instructor: " + instructorName);

                if (section.getCourse() != null) {
                    System.out.println("       Course: " + section.getCourse().getCourseName() +
                            " (" + section.getCourse().getCourseID() + ")");
                } else {
                    System.out.println("       Course: No assigned course");
                }

                if (section.getEnrolledStudents().isEmpty()) {
                    System.out.println("       └── No enrolled students");
                } else {
                    for (Student student : section.getEnrolledStudents()) {
                        System.out.println("       └── Student: [" + student.getPersonID() + "] " + student.getPersonName());
                    }
                }
            }
        }
        System.out.println("\n=============================================");
    }
}