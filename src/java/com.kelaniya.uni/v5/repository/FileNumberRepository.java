package com.kelaniya.uni.v5.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository{
    public double[] getNumbers() throws NumberRepositoryException {
        //Read numbers form the text file
        List<String> numbers;
        try {
            numbers = Files.readAllLines(
                Paths.get("D:/numbers.txt")
            );
        } catch (IOException e) {
            throw new NumberRepositoryException(e, "Couldn't read the text file.");
        }

        double num1 = Double.parseDouble(numbers.get(0));
        double num2 = Double.parseDouble(numbers.get(1));

        double[] nums = new double[2];
        nums[0] = num1;
        nums[1] = num2;

        return  nums;
    }
}
