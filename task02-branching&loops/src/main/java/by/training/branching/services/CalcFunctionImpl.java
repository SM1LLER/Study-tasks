package by.training.branching.services;

import by.training.task02.services.Calculator;

public class CalcFunctionImpl implements CalcFunction{
    @Override
    public double calculate(double x) {
        return (0 <= x && x <= 3) ? Calculator.powDouble(x) : 4.0;
    }
}
