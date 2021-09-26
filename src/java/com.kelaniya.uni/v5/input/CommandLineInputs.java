package com.kelaniya.uni.v5.input;

public class CommandLineInputs implements Inputs{
    String[] args;
    public CommandLineInputs(String[] args){
        this.args = args;
    }
    public String getOperator() throws InvalidInputException {
        //Making sure that there are arguments
        if (args.length == 0){
            throw new InvalidInputException("Provide the operator as an argument");
        }

        String operator = args[0];

        if ( !(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div")) ){
            throw new InvalidInputException("Please provide add, sub, mul, or div as the operator");
        }
        return operator;
    }
}
