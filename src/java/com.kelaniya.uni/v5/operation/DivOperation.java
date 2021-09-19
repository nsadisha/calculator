package com.kelaniya.uni.v5.operation;

public class DivOperation implements Operation{
    public double execute(double[] numbers) throws InvalidCalcOperationException {
        if(numbers[1] == 0){
            throw new InvalidCalcOperationException("Do not divide by zero");
        }

        return numbers[0] / numbers[1];
    }
}
