package by.training.loop.services;

import by.training.task02.services.Calculator;

public class CalcFunctionImpl implements CalcFunction{
    @Override
    public String[] calculate(double a, double b, double h) {
        String[] result = new String[(int)((b - a) / h)];
        int i = 0;
        for (double x = a; x <= b; x += h, i++){
            double func = Calculator.powDouble(Calculator.sin(x));
            result[i] = x + "\t" + func;
        }
        return result;
    }
}
