package org.example;

import org.example.model.Person;
import org.example.model.Employee;
import org.example.service.PersonEnrollment;
import org.example.service.EmployeeEnrollment;

public class Main {

    public static void main(String[] args) {

        // ===== PERSONS =====
        PersonEnrollment personEnrollment = new PersonEnrollment();
        personEnrollment.addPerson(new Person("Alice", 67));
        personEnrollment.addPerson(new Person("Bob", 78));
        personEnrollment.addPerson(new Person("Charlie", 90));

        System.out.println("=== Initial Persons ===");
        personEnrollment.displayALL();

        // Update Alice's age
        personEnrollment.updatePerson(new Person("Alice", 45));

        // Delete Alice
        personEnrollment.deletePersonRecord(new Person("Alice", 0));

        System.out.println("=== Updated Persons ===");
        personEnrollment.displayALL();

        // ===== EMPLOYEES =====
        EmployeeEnrollment employeeEnrollment = new EmployeeEnrollment();
        employeeEnrollment.addEmployee(new Employee(1, "Alice", "Developer"));
        employeeEnrollment.addEmployee(new Employee(2, "Bob", "Designer"));
        employeeEnrollment.addEmployee(new Employee(3, "Charlie", "Tester"));
        employeeEnrollment.addEmployee(new Employee(4, "David", "Manager"));

        System.out.println("=== Initial Employees ===");
        employeeEnrollment.displayAll();

        // Update Bob's position
        Employee updatedBob = new Employee(2, "Bob", "Designer");
        updatedBob.setEmployeePosition("Lead Designer");
        employeeEnrollment.updateEmployee(updatedBob);

        // Delete Alice
        Employee deleteAlice = new Employee(1, "Alice", "Developer");
        employeeEnrollment.deleteEmployee(deleteAlice);

        System.out.println("=== Updated Employees ===");
        employeeEnrollment.displayAll();
    }
}