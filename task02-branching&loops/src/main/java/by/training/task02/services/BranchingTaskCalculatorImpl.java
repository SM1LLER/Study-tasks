package by.training.task02.services;

import by.training.branching.services.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BranchingTaskCalculatorImpl implements BranchingTaskCalculator {
    static final Logger calcLogger = LogManager.getLogger("CalculatorLogger");
    private CalcFunction calcFunc = new CalcFunctionImpl();
    private DoubleOrAbs doubleOrAbs = new DoubleOrAbsImpl();
    private FindTheBiggest findBig = new FindTheBiggestImpl();
    private TriangleExistsWithAnglesChecker triangleCheck = new TriangleExistsWithAnglesCheckerImpl();
    private ReplaceBigger replaceBigger = new ReplaceBiggerImpl();

    @Override
    public int whichBiggest(int a, int b) {
        calcLogger.info("BranchTask: whichBiggest() start");
        calcLogger.debug(String.format("whichBiggest() Input: %d %d", a, b));
        int res = findBig.calculate(a,b);
        calcLogger.debug(String.format("whichBiggest() Output: %d", res));
        calcLogger.info("BranchTask: whichBiggest() end");
        return res;
    }

    @Override
    public double calcFunction(double x) {
        calcLogger.info("BranchTask: calcFunction() start");
        calcLogger.debug(String.format("calcFunction() Input: %f", x));
        double res = calcFunc.calculate(x);
        calcLogger.debug(String.format("calcFunction() Output: %f", res));
        calcLogger.info("BranchTask: calcFunction() end");
        return res;
    }

    @Override
    public int[] doubleOrAbs(int a, int b, int c) {
        calcLogger.info("BranchTask: doubleOrAbs() start");
        calcLogger.debug(String.format("doubleOrAbs() Input: %d %d %d", a, b, c));
        int[] res = doubleOrAbs.calculate(a, b, c);
        calcLogger.debug(String.format("doubleOrAbs() Output: %d %d %d", res[0], res[1], res[2]));
        calcLogger.info("BranchTask: doubleOrAbs() end");
        return res;
    }

    @Override
    public int[] replaceBiggest(int x, int y) {
        calcLogger.info("BranchTask: replaceBiggest() start");
        calcLogger.debug(String.format("replaceBiggest() Input: %d %d", x, y));
        int[] res = replaceBigger.calculate(x, y);
        calcLogger.debug(String.format("replaceBiggest() Output: %d %d", res[0], res[1]));
        calcLogger.info("BranchTask: replaceBiggest() end");
        return res;
    }

    @Override
    public boolean[] isTriangleExist(double a, double b) {
        calcLogger.info("BranchTask: isTriangleExist() start");
        calcLogger.debug(String.format("isTriangleExist() Input: %f %f", a, b));
        if (a < 0 || b < 0)
            throw new IllegalArgumentException(String.format("Angle can't be negative, but: %f %f", a, b));

        boolean[] res = triangleCheck.isExists(a, b);
        calcLogger.debug(String.format("isTriangleExist() Output: %b %b", res[0], res[1]));
        calcLogger.info("BranchTask: isTriangleExist() end");
        return res;
    }
}
