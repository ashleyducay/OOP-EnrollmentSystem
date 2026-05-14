package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentTitle;

    private List<Instructor> facultyMembers;
    private List<Section> academicSections;

    public Department(String departmentTitle) {
        this.departmentTitle = departmentTitle;
        this.facultyMembers = new ArrayList<>();
        this.academicSections = new ArrayList<>();
    }

    public List<Instructor> getFacultyMembers() {
        return facultyMembers;
    }

    public void setFacultyMembers(List<Instructor> facultyMembers) {
        this.facultyMembers = facultyMembers;
    }

    public List<Section> getAcademicSections() {
        return academicSections;
    }

    public void setAcademicSections(List<Section> academicSections) {
        this.academicSections = academicSections;
    }

    public String getDepartmentTitle() {
        return departmentTitle;
    }

    public List<Section> getSectionList() {
        return academicSections;
    }
}