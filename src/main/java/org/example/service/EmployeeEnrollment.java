package org.example.service;

import org.example.model.Employee;
import java.util.ArrayList;

public class EmployeeEnrollment {

    private ArrayList<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void displayAll() {
        for (Employee e : employeeList) {
            e.display();
        }
    }

    public void updateEmployee(Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee e = employeeList.get(i);
            if (e.getEmployeeName().equals(employee.getEmployeeName()) &&
                    e.getEmployeePosition().equals(employee.getEmployeePosition())) {
                employeeList.set(i, employee);
                break;
            }
        }
    }

    public void deleteEmployee(Employee employee) {
        employeeList.removeIf(e -> e.getEmployeeName().equals(employee.getEmployeeName())
                && e.getEmployeePosition().equals(employee.getEmployeePosition()));
    }
}