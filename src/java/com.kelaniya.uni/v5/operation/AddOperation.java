package com.kelaniya.uni.v5.operation;

public class AddOperation implements Operation{
    public double execute(double[] numbers){
        return numbers[0] + numbers[1];
    }
}
