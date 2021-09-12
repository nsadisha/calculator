package com.kelaniya.uni.v5;

import com.kelaniya.uni.v5.operation.Operation;
import com.kelaniya.uni.v5.operation.OperationFactory;
import com.kelaniya.uni.v5.repository.FileNumberRepository;

public class Main {
    public static void main(String[] args) throws Exception{

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileNumberRepository fileReader = new FileNumberRepository();
        double[] nums = fileReader.getNumbers();

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance(operator);
        double result = operation.execute(nums);

        UI.showMessage("Result is: "+result);
    }
}