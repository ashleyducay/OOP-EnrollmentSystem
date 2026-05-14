package org.example.service;

import org.example.model.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentRegistrationService {
    private List<Department> departments;

    public DepartmentRegistrationService(){
        this.departments = new ArrayList<>();
    }

    public void saveDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> displayAll(){
        return List.of();
    }
}
