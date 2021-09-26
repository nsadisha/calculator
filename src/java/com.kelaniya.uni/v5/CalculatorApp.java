package com.kelaniya.uni.v5;
import com.kelaniya.uni.v5.input.Inputs;
import com.kelaniya.uni.v5.input.InvalidInputException;
import com.kelaniya.uni.v5.operation.InvalidCalcOperationException;
import com.kelaniya.uni.v5.operation.Operation;
import com.kelaniya.uni.v5.operation.OperationFactory;
import com.kelaniya.uni.v5.repository.NumberRepository;
import com.kelaniya.uni.v5.repository.NumberRepositoryException;
import com.kelaniya.uni.v5.ui.UI;

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

    public void execute() { // we will change this in the future
        try {
            String operator = inputs.getOperator();
            double[] nums = numberRepository.getNumbers();
            Operation operation = operationFactory.getInstance(operator);
            double result = operation.execute(nums);
            ui.showMessage("Result is: " + result);
        }catch(InvalidCalcOperationException | InvalidInputException | NumberRepositoryException e){
            ui.showMessage("Error occurred..! " + e.getMessage());
        }
    }
}
