package com.example.calculator.calculator;

import com.example.calculator.calculator.interaces.Subtract;
import com.example.calculator.calculator.interaces.Sum;

public class Main {

    public static void main(String[] args) {
        Integer integer = sumNumbers((x, y) -> x + y );
        Integer result = subtractNumbers((x, y) -> x - y);

        System.out.println(integer);
        System.out.println(result);
    }


    public static Integer sumNumbers(Sum calculator) {
        return calculator.sum(10,5);
    }

    public static Integer subtractNumbers(Subtract calculator) {
        return  calculator.subtract(10, 5);
    }
}
