package com.kelaniya.uni.v5.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository{
    public double[] getNumbers() throws IOException {
        //Read numbers form the text file
        List<String> numbers = Files.readAllLines(
//                Paths.get("src/java/com.kelaniya.uni/v2/in/numbers.txt")
                Paths.get("D:/numbers.txt")
        );

        double num1 = Double.parseDouble(numbers.get(0));
        double num2 = Double.parseDouble(numbers.get(1));
        double[] nums = new double[2];
        nums[0] = num1;
        nums[1] = num2;

        return  nums;
    }
}
