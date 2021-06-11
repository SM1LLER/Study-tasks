package by.training.task02.controller;

import by.training.task02.service.*;
import by.training.task02.service.impl.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class LoopTasksCalculatorImpl implements LoopTasksCalculator {
    static final Logger calcLogger = LogManager.getLogger("CalculatorLogger");
    private ArithmProgrChecker progrChecker = new ArithmProgrCheckerImpl();
    private CalcArithmProgr progrCalc = new CalcArithmProgrImpl();
    private CalcFunctionLoop calcFunction = new CalcFunctionLoopImpl();
    private RomanToArab romanToArab = new RomanToArabImpl();
    private SumFromOneToX sumToX = new SumFromOneToXImpl();

    @Override
    public double calcArithmProgres(int n) {
        calcLogger.info("LoopTask: calcArithmProgres() start");
        calcLogger.debug(String.format("calcArithmProgres() Input: %d", n));

        if (n <= 0)
            throw new IllegalArgumentException("Argument should be natural number, but: " + n);
        double res = progrCalc.calc(n);

        calcLogger.debug(String.format("calcArithmProgres() Output: %f", res));
        calcLogger.info("LoopTask: calcArithmProgres() end");
        return res;
    }

    @Override
    public boolean hasProgression(int a) {
        calcLogger.info("LoopTask:  hasProgression() start");
        calcLogger.debug(String.format("hasProgression() Input: %d", a));

        if (a < 100)
            throw new IllegalArgumentException("Argument should be positive 3-digit number, but: " + a);

        boolean res = progrChecker.hasProgression(a);
        calcLogger.debug(String.format("hasProgression() Output: %b", res));
        calcLogger.info("LoopTask:  hasProgression() end");
        return res;
    }

    @Override
    public String[] calcFunction(double a, double b, double h) {
        calcLogger.info("LoopTask:  calcFunction() start");
        calcLogger.debug(String.format("calcFunction() Input: %f %f %f", a, b, h));

        if (b < a)
            throw new IllegalArgumentException(
                    String.format("End bound can't be lower than start bound: [%f, %f]", a, b)
            );

        String[] res = calcFunction.calculate(a, b ,h);
        calcLogger.debug("calcFunction() Output: " + Arrays.toString(res));
        calcLogger.info("LoopTask:  calcFunction() end");
        return res;
    }

    @Override
    public int translateFromRoman(String roman) {
        calcLogger.info("LoopTask:  translateFromRoman() start");
        calcLogger.debug("translateFromRoman() Input: " + roman);

        String rom = roman.toUpperCase();
        if (!rom.matches("[M|D|C|L|X|V|I]*"))
            throw new IllegalArgumentException("Impossible to convert. Wrong roman numeral");

        int res = romanToArab.translate(rom);
        calcLogger.debug("translateFromRoman() Output: " + res);
        calcLogger.info("LoopTask:  translateFromRoman() end");
        return res;
    }

    @Override
    public int calcSumToX(int x) {
        calcLogger.info("LoopTask:  calcSumToX() start");
        calcLogger.debug("calcSumToX() Input: " + x);
        if (x <= 0)
            throw new IllegalArgumentException("Argument should be positive number, but: " + x);

        int res = sumToX.sum(x);
        calcLogger.debug("calcSumToX() Output: " + res);
        calcLogger.info("LoopTask:  calcSumToX() end");
        return res;
    }
}
