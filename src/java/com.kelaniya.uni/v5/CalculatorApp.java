package com.kelaniya.uni.v5;
import com.kelaniya.uni.v5.input.Inputs;
import com.kelaniya.uni.v5.input.InvalidInputException;
import com.kelaniya.uni.v5.operation.InvalidCalcOperationException;
import com.kelaniya.uni.v5.operation.Operation;
import com.kelaniya.uni.v5.operation.OperationFactory;
import com.kelaniya.uni.v5.repository.NumberRepository;
import com.kelaniya.uni.v5.ui.UI;

import java.io.IOException;

public class CalculatorApp {
    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;

    public CalculatorApp(Inputs inputs, NumberRepository numberRepository, OperationFactory operationFactory, UI ui) {

        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute() throws IOException { // we will change this in the future
        String operator;
        try {
            operator = inputs.getOperator();
        } catch (InvalidInputException e) {
            ui.showMessage("Error occurred..! " + e.getMessage());
            return;
        }
        double[] nums = numberRepository.getNumbers();
        Operation operation = operationFactory.getInstance(operator);
        double result;
        try {
            result = operation.execute(nums);
        } catch (InvalidCalcOperationException e) {
            ui.showMessage("Error occurred..! " + e.getMessage());
            return;
        }
        ui.showMessage("Result is: "+result);
    }
}
