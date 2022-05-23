package com.example.calculator.calculator;

public class Calculator {

    public Integer sum(Integer x, Integer y) {
        if (y == 0) {
            return x;
        } else {
            return (1 + sum(x, y - 1));
        }
    }

    public Integer subtract(Integer x, Integer y) {
        if (y == 0) {
            return x;
        } else {
            return subtract((x - 1), (y - 1));
        }
    }

    public Integer multiply(Integer x, Integer y) {
        return 0;
    }

    public Integer divide(Integer x, Integer y) {
        return 0;
    }
}
