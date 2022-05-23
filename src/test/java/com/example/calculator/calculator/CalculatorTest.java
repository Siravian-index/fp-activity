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
        assertEquals(String.valueOf(10), underTest.sum(5,5));
        assertEquals(String.valueOf(60), underTest.sum(20, 10, 20, 10));
    }

    @Test
    void subtractSuccessfully() {
        assertEquals(String.valueOf(5), underTest.subtract(10, 5));
        assertEquals(String.valueOf(-5), underTest.subtract(5,5,5));
        assertEquals(String.valueOf(40), underTest.subtract(50,5,5));
    }


}