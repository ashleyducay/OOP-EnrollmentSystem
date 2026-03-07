package org.example.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }
    @Test
    void shouldAddCorrectAnswer() {

        // Arrange
        //Calculator calculator = new Calculator();

        // Act
        //int result = calculator.add(2,3);

        // Assert
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    void shouldSubtractTwoNumbers(){

        //Calculator calculator = new Calculator();

        //int result = calculator.subtraction(5,3);

        assertEquals(2,  calculator.subtraction(5,3) );
    }
    @Test
    void shouldMultiplyTwoNumbers(){
        //Calculator calculator = new Calculator();

        //int result = calculator.multiply(4,3);
        assertEquals(12, calculator.multiply(4,3));
    }

    @Test
    void shouldDivideTwoNumbers(){
        //Calculator calculator = new Calculator();
       // int result = calculator.division(10,2);
        assertEquals(5, calculator.division(10,2));
    }
}