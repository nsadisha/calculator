package com.kelaniya.uni.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{

        //Making sure that there are arguments
        if (args.length == 0){
            System.out.println("Provide the operator as an argument");
            return;
        }

        String operator = args[0];

        if ( !(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div")) ){
            System.out.println("Please provide add, sub, mul, or div as the operator");
            return;
        }

        //Read numbers form the text file
        List<String> numbers = Files.readAllLines(
                Paths.get("src/java/com.kelaniya.uni/v2/in/numbers.txt")
        );

        double num1 = Double.parseDouble(numbers.get(0));
        double num2 = Double.parseDouble(numbers.get(1));

        double result;

        //Do the operation
        if(operator.equals("add")){
            result = num1 + num2;
        }else if(operator.equals("sub")){
            result = num1 - num2;
        }else if(operator.equals("mul")){
            result = num1 * num2;
        }else{
            result = num1 / num2;
        }

        //Outputting
        System.out.println("Result is: "+result);
    }
}