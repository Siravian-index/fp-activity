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
        assertEquals(10, underTest.sum(4, 6));
        assertEquals(33, underTest.sum(22, 11));
        assertEquals(40, underTest.sum(20, 20));
    }

    @Test
    void subtractSuccessfully() {
        assertEquals(5, underTest.subtract(10, 5));
        assertEquals(0, underTest.subtract(5, 5));
        assertEquals(-5, underTest.subtract(5, 10));
    }

    @Test
    void divideSuccessfully() {
        assertEquals(5, underTest.divide(10, 2));
        assertEquals(10, underTest.divide(20, 2));
    }

    @Test
    void diveThrowsErrorIfThereIsZero() {
        assertThrows(ArithmeticException.class, () -> underTest.divide(10, 0));
    }

    @Test
    void multiplySuccessfully() {
        assertEquals(10, underTest.multiply(5, 2));
        assertEquals(25, underTest.multiply(5, 5));
        assertEquals(-100, underTest.multiply(50, -2));
    }

    @Test
    void factorialSuccessfully() {
        assertEquals(120, underTest.factorial(5));
        assertEquals(720, underTest.factorial(6));
        assertEquals(362880, underTest.factorial(9));
    }


}