package org.example.service;

import org.example.model.*;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CourseRegistrationTest {

    @Test
    void shouldCorrectlyUpdateCourseInMasterRecord() {

        CourseRegistration cr = new CourseRegistration();
        Course javaCourse = new Course("CS101", "Java", "IT", 3);
        cr.save(javaCourse);


        Course foundCourse = cr.findByID("CS101");
        foundCourse.setUnits(4);

        assertEquals(4, cr.findByID("CS101").getUnits(), "The course units were not updated in the master record.");
    }

}