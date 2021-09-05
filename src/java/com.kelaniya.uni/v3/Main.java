package com.kelaniya.uni.v3;

import com.kelaniya.uni.v3.operation.AddOperation;
import com.kelaniya.uni.v3.operation.MulOperation;
import com.kelaniya.uni.v3.operation.SubOperation;

public class Main {
    public static void main(String[] args) throws Exception{

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        double[] nums = fileReader.getNumbers();

        double result = 0;

        if(operator.equals("add")){
            AddOperation operation = new AddOperation();
            result = operation.execute(nums);
        }else if(operator.equals("sub")){
            SubOperation operation = new SubOperation();
            result = operation.execute(nums);
        }else if(operator.equals("mul")){
            MulOperation operation = new MulOperation();
            result = operation.execute(nums);
        }

        System.out.println("Result is: "+result);
    }
}