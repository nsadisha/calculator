package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MulOperationTest {
    /*
     * Test cases
     *
     * Positive number * Positive number => Correct answer
     * Negative number * Negative number => Correct answer
     * Positive number * Negative number => Correct answer
     * Zero * Zero => Zero
     * Positive number * 0 => Correct answer
     * Negative number * 0 => Correct answer
     * */

    @Test
    public void should_multiply_positive_numbers(){
        MulOperation mulOperation = new MulOperation();
        double result = mulOperation.execute(new double[]{5.0, 6.0});

        assertThat(result, is(30.0));
    }

    @Test
    public void should_multiply_negative_numbers(){
        MulOperation mulOperation = new MulOperation();
        double result = mulOperation.execute(new double[]{-3.0, -5.0});

        assertThat(result, is(15.0));
    }

    @Test
    public void should_multiply_both_positive_and_negative_numbers(){
        MulOperation mulOperation = new MulOperation();
        double result = mulOperation.execute(new double[]{-6.0, 8.0});

        assertThat(result, is(-48.0));
    }

    @Test
    public void should_multiply_zeros(){
        MulOperation mulOperation = new MulOperation();
        double result = mulOperation.execute(new double[]{0.0, 0.0});

        assertThat(result, is(0.0));
    }

    @Test
    public void should_multiply_positive_numbers_with_zeros(){
        MulOperation mulOperation = new MulOperation();
        double result = mulOperation.execute(new double[]{9.0, 0.0});

        assertThat(result, is(0.0));
    }

    @Test
    public void should_multiply_negative_numbers_with_zeros(){
        MulOperation mulOperation = new MulOperation();
        double result = mulOperation.execute(new double[]{-9.0, 0.0});

        assertThat(result, is(0.0));
    }
}