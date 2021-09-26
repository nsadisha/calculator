package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DivOperationTest {

    @Test
    public void should_divide_positive_values() throws InvalidCalcOperationException {
        DivOperation divOperation = new DivOperation();
        double result = divOperation.execute(new double[] {6.0, 3.0});

        assertThat(result, is(2.0));
    }
    @Test
    public void should_divide_negative_values() throws InvalidCalcOperationException {
        DivOperation divOperation = new DivOperation();
        double result = divOperation.execute(new double[] {-9.0, -3.0});

        assertThat(result, is(3.0));
    }
    @Test
    public void should_divide_negative_and_positive_values() throws InvalidCalcOperationException {
        DivOperation divOperation = new DivOperation();
        double result = divOperation.execute(new double[] {-9.0, 3.0});

        assertThat(result, is(-3.0));
    }
    @Test(expected = InvalidCalcOperationException.class)
    public void should_not_divide_by_zero() throws InvalidCalcOperationException {
        DivOperation divOperation = new DivOperation();
        double result = divOperation.execute(new double[] {6.0, 0.0});
    }

}