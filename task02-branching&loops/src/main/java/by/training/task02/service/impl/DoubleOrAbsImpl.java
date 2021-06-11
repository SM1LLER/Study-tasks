package by.training.task02.service.impl;

import by.training.task02.service.Calculator;
import by.training.task02.service.DoubleOrAbs;

public class DoubleOrAbsImpl implements DoubleOrAbs {
    @Override
    public int[] calculate(int a, int b, int c) {
        if (a > b && b > c){
            return new int[]{ a * 2, b * 2, c * 2};
        } else {
            int[] result = new int[3];
            result[0] = Calculator.abs(a);
            result[1] = Calculator.abs(b);
            result[2] = Calculator.abs(c);
            return result;
        }
    }
}
