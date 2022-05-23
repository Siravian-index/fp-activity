package com.example.calculator.calculator;

import com.example.calculator.calculator.interaces.Sum;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Integer result = sumNumbers(calculator, 6, 6);
        System.out.println(result);
//        sumNumbers(() -> )
    }


    public static Integer sumNumbers(Sum calculator, Integer x, Integer y) {
        return calculator.sum(x, y);
    }
}
