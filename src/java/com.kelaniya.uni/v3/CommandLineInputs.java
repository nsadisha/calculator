package com.kelaniya.uni.v3;

public class CommandLineInputs {
    String[] args;
    CommandLineInputs(String[] args){
        this.args = args;
    }
    public String getOperator(){
        //Making sure that there are arguments
        if (args.length == 0){
            System.out.println("Provide the operator as an argument");
//            return;
        }

        String operator = args[0];

        if ( !(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div")) ){
            System.out.println("Please provide add, sub, mul, or div as the operator");
//            return;
        }
        return operator;
    }
}
