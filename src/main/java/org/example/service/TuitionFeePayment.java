package org.example.service;

import org.example.model.Course;
import org.example.model.Instructor;
import org.example.model.Student;

public class TuitionFeePayment {
    private final double PRICE_PER_UNITS = 1000;
    private double balance;
    private double totalTuitionFee;

    public double calculateTuitionFee(int units, double discountRate){
        totalTuitionFee = units * PRICE_PER_UNITS;

        if(discountRate != 0){
            totalTuitionFee = totalTuitionFee - (totalTuitionFee * discountRate);
        }
        return totalTuitionFee;
    }
    public void makePayment(double amount){
        balance = totalTuitionFee - amount;
    }
    public double getBalance(){
        return balance;
    }
    public boolean isFullyPaid(){
        return balance > 0 ? false : true;
    }

    public static class Main {

        public static void main(String[] args) {

            ServiceRegistration sr = new ServiceRegistration();

            System.out.println("              ");

            Student s1 = new Student("IT");
            s1.setPersonID("000123");
            s1.setPersonName("Alice");

            Student s2 = new Student("CS");
            s2.setPersonID("000124");
            s2.setPersonName("Bob");

            sr.addStudent(s1);
            sr.addStudent(s2);

            sr.displayAll();



            CourseRegistration cr = new CourseRegistration();

            Course c1 = new Course("C001","Integrative Programming","IT");
            Course c2 = new Course("C002","Data Structures","CS");

            cr.saveCourse(c1);
            cr.saveCourse(c2);

            cr.displayAllCourse();



            Instructor i1 = new Instructor("I001","Trish","Integrative Programming");
            Instructor i2 = new Instructor("I002","Keziah","Data Structures");

            System.out.println("\nInstructor List");

            System.out.println(i1.getPersonID()+" "+i1.getPersonName()+" "+i1.getCourses());
            System.out.println(i2.getPersonID()+" "+i2.getPersonName()+" "+i2.getCourses());

            System.out.println("                                 ");



            TuitionFeePayment tuitionFeePayment = new TuitionFeePayment();
            System.out.println(tuitionFeePayment.calculateTuitionFee(3, 0));
            tuitionFeePayment.makePayment(1000);

            System.out.println(tuitionFeePayment.getBalance());
            System.out.println(tuitionFeePayment.isFullyPaid());
        }
    }
}