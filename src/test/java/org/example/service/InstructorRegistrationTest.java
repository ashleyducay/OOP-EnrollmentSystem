package org.example.service;

import org.example.model.*;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class InstructorRegistrationTest {

    @Test
    void shouldSuccessfullyLinkInstructorToSection() {

        Instructor prof = new Instructor("Prof. Miller", "INS-01", "Java");
        Section section = new Section("IT1A", 30, null, new ArrayList<>());
        InstructorRegistration ir = new InstructorRegistration();


        ir.assignInstructorToSection(prof, section);

        String instructorName = section.getInstructorInCharge();

        assertNotNull(instructorName);
        assertEquals("Prof. Miller", instructorName);
    }
}