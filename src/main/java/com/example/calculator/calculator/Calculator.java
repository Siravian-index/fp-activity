package com.example.calculator.calculator;

import com.example.calculator.calculator.interaces.Sum;

public class Calculator implements Sum {


    @Override
    public Integer sum(Integer x, Integer y) {
        return x + y;
    }
}
