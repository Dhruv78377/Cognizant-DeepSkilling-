package com.cognizant.junit;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorAAATest {

    private Calculator calculator;

    // Inner class so only one file is needed
    class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }
    }

    // Setup method
    @BeforeEach
    void setUp() {
        System.out.println("Setup");
        calculator = new Calculator();
    }

    // Teardown method
    @AfterEach
    void tearDown() {
        System.out.println("Teardown");
        calculator = null;
    }

    @Test
    void testAdd() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    void testSubtract() {

        // Arrange
        int a = 20;
        int b = 5;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(15, result);
    }

    @Test
    void testMultiply() {

        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(50, result);
    }
}