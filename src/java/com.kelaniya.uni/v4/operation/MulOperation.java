package com.kelaniya.uni.v4.operation;

public class MulOperation implements Operation{
    public double execute(double[] numbers){
        return numbers[0] * numbers[1];
    }
}
