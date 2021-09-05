package com.kelaniya.uni.v4;

import com.kelaniya.uni.v4.operation.Operation;
import com.kelaniya.uni.v4.operation.OperationFactory;

public class Main {
    public static void main(String[] args) throws Exception{

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        double[] nums = fileReader.getNumbers();

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance(operator);
        double result = operation.execute(nums);

        UI.showMessage("Result is: "+result);
    }
}