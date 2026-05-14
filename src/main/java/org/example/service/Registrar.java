package org.example.service;

import org.example.model.*;
import java.util.*;

public class Registrar {
    private StudentReg studentReg;
    private CourseReg courseReg;
    private DepartmentReg departmentReg;
    private SectionReg sectionReg;
    private TuitionReg tuitionReg;
    private IEnrollmentService enrollmentService;
    private InstructorRegistration instructorRegistration;


    public Registrar(StudentReg studentRegistration, CourseReg courseRegistration, DepartmentReg departmentRegistration,
                     SectionReg sectionRegistration, TuitionReg tuitionRegistration, IEnrollmentService enrollmentService,
                     InstructorRegistration instructorRegistration) {
        this.studentReg = studentRegistration;
        this.courseReg = courseRegistration;
        this.departmentReg = departmentRegistration;
        this.sectionReg = sectionRegistration;
        this.tuitionReg = tuitionRegistration;
        this.enrollmentService = enrollmentService;
        this.instructorRegistration = instructorRegistration;
    }

    public void saveStudent(Student student){
        studentReg.saveStudent(student);
    }

    public void displayAllStudent(){
        studentReg.displayAllStudent();
    }

    public void removeStudent(String id){
        Student found = ((StudentRegistration)studentReg).findByID(id);
        if (found != null) {
            studentReg.removeStudent(found);
            System.out.println("Student removed!");
        } else {
            System.out.println("Student ID " + id + " does not exist!");
        }
    }


    public void calculateAndSetTuition(Student s, int units) {
        double fee = tuitionReg.calculateTuitionFee(units, 0);

        if (s.getTuitionDetails() != null) {
            s.getTuitionDetails().setBalance(s.getTuitionDetails().getBalance() + fee);
        }
        System.out.println("Tuition set: PHP " + fee);
    }


    public void processStudentPayment(String studentID, double amount){
        Student student = ((StudentRegistration)studentReg).findByID(studentID);
        if (student != null) {
            tuitionReg.makePayment(amount);
            if (student.getTuitionDetails() != null) {
                double newBal = student.getTuitionDetails().getBalance() - amount;
                student.getTuitionDetails().setBalance(newBal);
            }
        } else {
            System.out.println("Payment failed: Student not found.");
        }
    }

    public void checkStudentBalance(String studentID) {
        Student student = ((StudentRegistration)studentReg).findByID(studentID);
        if (student != null) {
            System.out.println("Student: " + student.getPersonName());
            if (student.getTuitionDetails() != null) {
                System.out.println("Balance: PHP " + student.getTuitionDetails().getBalance());
            } else {
                System.out.println("Balance: PHP 0.0 (No Tuition Records)");
            }
        } else {
            System.out.println("Student not found!");
        }
    }

    public void save(Course course){
        courseReg.save(course);
    }

    public void displayAll(){
        courseReg.displayAll();
    }

    public void saveDept(Department department){
        departmentReg.save(department);
        System.out.println("Department saved.");
    }

    public void enrollStudent(Section section, Student student) {
        enrollmentService.enrollStudentInSection(section, student);
    }

    public void displayHierarchy() {
        List<Department> allDepts = departmentReg.displayAll();
        if (allDepts.isEmpty()) {
            System.out.println("No Departments found.");
            return;
        }
        enrollmentService.viewDepartmentHierarchy(allDepts);
    }

    public void displayAllDeptartment() {
        departmentReg.displayAll();
    }


    public Department findDeptByName(String s) {
        List<Department> allDepts = departmentReg.displayAll();
        for (Department dept : allDepts) {
            if (dept.getDepartmentTitle().equalsIgnoreCase(s)) {
                return dept;
            }
        }
        return null;
    }
}