package com.kelaniya.uni.v2;

public class HelloWorld {
    public static void main(String[] args) {

        if (args.length == 0){
            System.out.println("Provide the operator as an argument");
            return;
        }

        String operator = args[0];

        if ( !(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div")) ){
            System.out.println("Please provide add, sub, mul, or div as the operator");
            return;
        }
    }
}