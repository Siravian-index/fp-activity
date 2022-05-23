package com.example.calculator.calculator;

import com.example.calculator.calculator.interaces.Subtract;
import com.example.calculator.calculator.interaces.Sum;

public class Calculator implements Sum, Subtract {


    @Override
    public Integer sum(Integer x, Integer y) {
        return x + y;
    }

    @Override
    public Integer subtract(Integer x, Integer y) {
        return x - y;
    }
}
