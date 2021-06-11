package by.training.task02.service.impl;

import by.training.task02.service.CalcFunctionLoop;
import by.training.task02.service.Calculator;

public class CalcFunctionLoopImpl implements CalcFunctionLoop {

    @Override
    public String[] calculate(double a, double b, double h) {
        String[] result = new String[(int)((b - a) / h) + 1];
        int i = 0;
        for (double x = a; x <= b; x += h, i++){
            double func = Calculator.powDouble(Math.sin(x));
            result[i] = x + "\t" + func;
        }
        return result;
    }
}
