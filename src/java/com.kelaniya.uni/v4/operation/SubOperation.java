package com.kelaniya.uni.v4.operation;

public class SubOperation implements Operation{
    public double execute(double[] numbers){
        return numbers[0] - numbers[1];
    }
}
