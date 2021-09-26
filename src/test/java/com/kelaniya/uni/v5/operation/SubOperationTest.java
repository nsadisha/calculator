package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SubOperationTest {

    /*
     * Test cases
     *
     * Bigger positive number - Smaller positive number => Correct answer
     * Smaller positive number - Bigger positive number => Correct answer
     * Bigger negative number - Smaller negative number => Correct answer
     * Smaller negative number - Bigger negative number => Correct answer
     * Positive number - Negative number => Correct answer
     * Negative number - Positive number => Correct answer
     * Zero - Aero => Zero
     * */

    @Test
    public void should_subtract_smaller_positive_values_from_bigger_positive_values(){
        SubOperation subOperation = new SubOperation();
        double result = subOperation.execute(new double[]{5.0, 3.0});

        assertThat(result, is(2.0));
    }

    @Test
    public void should_subtract_bigger_positive_values_from_smaller_positive_values(){
        SubOperation subOperation = new SubOperation();
        double result = subOperation.execute(new double[]{2.0, 8.0});

        assertThat(result, is(-6.0));
    }

    @Test
    public void should_subtract_smaller_negative_values_from_bigger_negative_values(){
        SubOperation subOperation = new SubOperation();
        double result = subOperation.execute(new double[]{-5.0, -3.0});

        assertThat(result, is(-2.0));
    }

    @Test
    public void should_subtract_bigger_negative_values_from_smaller_negative_values(){
        SubOperation subOperation = new SubOperation();
        double result = subOperation.execute(new double[]{-2.0, -8.0});

        assertThat(result, is(6.0));
    }

    @Test
    public void should_subtract_negative_values_from_positive_values(){
        SubOperation subOperation = new SubOperation();
        double result = subOperation.execute(new double[]{2.0, -8.0});

        assertThat(result, is(10.0));
    }

    @Test
    public void should_subtract_positive_values_from_negative_values(){
        SubOperation subOperation = new SubOperation();
        double result = subOperation.execute(new double[]{-2.0, 8.0});

        assertThat(result, is(-10.0));
    }

    @Test
    public void should_subtract_zeros(){
        SubOperation subOperation = new SubOperation();
        double result = subOperation.execute(new double[]{0.0, 0.0});

        assertThat(result, is(0.0));
    }

}