package by.training.task02.service.impl;


import by.training.task02.service.CalcFunctionBranch;
import by.training.task02.service.Calculator;

public class CalcFunctionBranchImpl implements CalcFunctionBranch {
    @Override
    public double calculate(double x) {
        return (0 <= x && x <= 3) ? Calculator.powDouble(x) : 4.0;
    }
}
