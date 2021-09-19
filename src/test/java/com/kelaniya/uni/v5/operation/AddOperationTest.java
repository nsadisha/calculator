package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AddOperationTest {

    /*
    * Test cases
    *
    * Positive number + Positive number => Correct answer
    * Zero + Aero => Zero
    * Negative number + Negative number => Correct answer
    * Positive number + Negative number => Correct answer
    * */

    @Test
    public void should_add_positive_values(){
        AddOperation addOperation = new AddOperation();
        double result = addOperation.execute(new double[]{5, 6});

        assertThat(result, is(11.0));
    }

}