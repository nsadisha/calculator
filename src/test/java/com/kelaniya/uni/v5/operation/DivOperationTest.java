package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThrows;

public class DivOperationTest {

    @Test
    public void should_divide_positive_values() throws InvalidCalcOperationException {
        DivOperation divOperation = new DivOperation();
        double result = divOperation.execute(new double[] {6.0, 3.0});

        assertThat(result, is(2.0));
    }
    @Test
    public void should_not_divide_by_zero() throws InvalidCalcOperationException {
        DivOperation divOperation = new DivOperation();
        double result = divOperation.execute(new double[] {6.0, 0.0});

        //will be continued
    }

}