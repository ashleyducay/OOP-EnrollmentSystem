package org.example.service;

import org.example.model.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentRegistration implements DepartmentReg {

    private List<Department> departmentRecords;

    public DepartmentRegistration() {
        this.departmentRecords = new ArrayList<>();
    }

    @Override
    public void save(Department department) {


        if (department.getFacultyMembers() == null) {
            department.setFacultyMembers(new ArrayList<>());
        }

        if (department.getAcademicSections() == null) {
            department.setAcademicSections(new ArrayList<>());
        }

        departmentRecords.add(department);

        System.out.println(
                "Department successfully registered: "
                        + department.getDepartmentTitle()
        );
    }

    @Override
    public List<Department> displayAll() {
        return departmentRecords;
    }
}