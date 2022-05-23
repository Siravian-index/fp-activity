package com.example.calculator.calculator;

import com.example.calculator.calculator.interaces.Subtract;
import com.example.calculator.calculator.interaces.Sum;

public class Main {

    public static void main(String[] args) {
        Subtract subtract = ((x, y) -> x - y);
        Sum sum = ((x, y) -> x + y);

    }

}
