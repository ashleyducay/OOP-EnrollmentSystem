package org.example.service;

import org.example.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TuitionRegistrationTest {

    @Test
    void shouldHandleOverpaymentCorrectly() {

        TuitionRegistration tr = new TuitionRegistration();
        Student student = new Student("Alice", "S1", "IT");
        student.getTuitionDetails().setBalance(1000.0);


        tr.makePayment(student, 1500.0);


        assertEquals(-500.0, student.getTuitionDetails().getBalance(), "The system should reflect a credit balance on overpayment.");
    }

}