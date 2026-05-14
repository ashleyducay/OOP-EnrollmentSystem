package org.example.service;

import org.example.model.Student;

public class TuitionRegistration implements TuitionReg {

    private final double UNIT_RATE = 1000.0;
    private double currentBalance;

    @Override
    public double calculateTuitionFee(int units, double discounts) {
        this.currentBalance = units * UNIT_RATE;
        if (discounts > 0) {
            this.currentBalance -= (this.currentBalance * discounts);
        }
        return this.currentBalance;
    }


    @Override
    public void makePayment(double amount) {
        this.currentBalance -= amount;
        System.out.println("Transaction successful.");
        System.out.println("Balance after payment: PHP " + this.currentBalance);
    }


    public void makePayment(Student student, double amount) {
        this.currentBalance -= amount;
        System.out.println("Transaction successful.");
        System.out.println("Balance after payment: PHP " + this.currentBalance);
    }

    @Override
    public double getBalance() {
        return this.currentBalance;
    }

    public double getRemainingBalance(Student student) {
        return this.currentBalance;
    }

    public boolean isFullyPaid() {
        return this.currentBalance <= 0;
    }

    public boolean isFullyPaid(Student student) {
        return this.currentBalance <= 0;
    }
}