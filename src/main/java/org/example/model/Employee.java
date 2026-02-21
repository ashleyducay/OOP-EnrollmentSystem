package org.example.model;

public class Employee {

    private int employeeID;
    private String employeeName;
    private String employeePosition;

    public Employee() {
        this(0, "Unknown", "Unknown");
    }

    public Employee(int employeeID, String employeeName, String employeePosition) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeePosition = employeePosition;
    }

    public int getEmployeeID() { return employeeID; }
    public void setEmployeeID(int employeeID) { this.employeeID = employeeID; }

    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }

    public String getEmployeePosition() { return employeePosition; }
    public void setEmployeePosition(String employeePosition) { this.employeePosition = employeePosition; }

    public void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Position: " + employeePosition);
        System.out.println();
    }

    public String toString() {
        return "Employee ID: " + employeeID + ", Name: " + employeeName + ", Position: " + employeePosition;
    }
}