package com.example.calculator.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator underTest;

    @BeforeEach
    void setUp() {
        underTest = new Calculator();
    }

    @Test
    void sumSuccessfully() {
        assertEquals(10, underTest.sum(3, 3, 3, 1));
        assertEquals(10, underTest.sum(5, 5));
        assertEquals(60, underTest.sum(20, 20, 20));
    }

    @Test
    void subtractSuccessfully() {
        assertEquals(5, underTest.subtract(10, 5));
        assertEquals(0, underTest.subtract(10, 5, 5));
        assertEquals(-5, underTest.subtract(5, 5, 5));
    }

    void divideSuccessfully() {
        assertEquals(5, underTest.divide(10, 2));
        assertEquals(10, underTest.divide(20, 2));
        assertEquals(5, underTest.divide(100, 2, 2, 5));
    }

    void diveThrowsErrorIfThereIsZero() {
        assertThrows(ArithmeticException.class, () -> underTest.divide(10, 0));
        assertThrows(ArithmeticException.class, () -> underTest.divide(100, 2, 2, 0));
    }

    void multiplySuccessfully() {
        assertEquals(10, underTest.divide(5, 2));
        assertEquals(125, underTest.divide(5, 5, 5));
        assertEquals(-100, underTest.divide(10, 5, -2));
    }


}