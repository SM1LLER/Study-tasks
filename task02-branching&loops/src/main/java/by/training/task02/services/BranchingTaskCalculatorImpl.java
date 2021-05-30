package by.training.task02.services;

import by.training.branching.services.*;

public class BranchingTaskCalculatorImpl implements BranchingTaskCalculator {
    private CalcFunction calcFunc = new CalcFunctionImpl();
    private DoubleOrAbs doubleOrAbs = new DoubleOrAbsImpl();
    private FindTheBiggest findBig = new FindTheBiggestImpl();
    private TriangleExistsWithAnglesChecker triangleCheck = new TriangleExistsWithAnglesCheckerImpl();
    private ReplaceBigger replaceBigger = new ReplaceBiggerImpl();

    @Override
    public int whichBiggest(int a, int b) {
        return findBig.calculate(a, b);
    }

    @Override
    public double calcFunction(double x) {
        return calcFunc.calculate(x);
    }

    @Override
    public int[] doubleOrAbs(int a, int b, int c) {
        return doubleOrAbs.calculate(a, b, c);
    }

    @Override
    public int[] replaceBiggest(int x, int y) {
        return replaceBigger.calculate(x, y);
    }

    @Override
    public boolean[] isTriangleExist(double a, double b) {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException(String.format("Angle can't be negative, but: %f %f", a, b));

        return triangleCheck.isExists(a, b);
    }
}
