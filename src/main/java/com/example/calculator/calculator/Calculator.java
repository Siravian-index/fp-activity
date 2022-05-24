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
        if (y > 0) {
            return x + multiply(x, y - 1);
        } else if (y < 0) {
            return -x + multiply(x, y + 1);
        }
        return 0;
    }

    public Integer divide(Integer x, Integer y) {
        if (y == 0) {
            throw new ArithmeticException();
        } else if (x - y == 0) {
            return 1;
        } else if (x < y) {
            return 0;
        } else {
            return (1 + divide(x - y, y));
        }
    }

    public Integer factorial(Integer x) {
        if (x == 1 ){
            return 1;
        }
        return x * factorial(x - 1);
    }
}
