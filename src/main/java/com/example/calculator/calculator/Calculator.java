package com.example.calculator.calculator;

import java.util.Arrays;

public class Calculator {

    public String sum(int ...nums) {
        return String.valueOf(Arrays.stream(nums).sum());
    }


    public String subtract(int ...nums) {
        return String.valueOf(Arrays.stream(nums).reduce((left, right) -> left - right).orElse(0));
    }

    public String divide(int ...nums) {
        boolean anyMatch = Arrays.stream(nums).anyMatch(value -> value == 0);
        if (anyMatch) {
            return "Error";
        }
        return String.valueOf(Arrays.stream(nums).reduce((left, right) -> left / right).orElse(0));
    }

    public String multiply(int ...nums) {
        return String.valueOf(Arrays.stream(nums).reduce((left, right) -> left * right).orElse(0));
    }
}
