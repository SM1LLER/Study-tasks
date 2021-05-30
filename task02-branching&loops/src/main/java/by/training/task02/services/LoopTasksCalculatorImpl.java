package by.training.task02.services;

import by.training.loop.services.*;

public class LoopTasksCalculatorImpl implements LoopTasksCalculator {
    private ArithmProgrChecker progrChecker = new ArithmProgrCheckerImpl();
    private CalcArithmProgr progrCalc = new CalcArithmProgrImpl();
    private CalcFunction calcFunction = new CalcFunctionImpl();
    private RomanToArab romanToArab = new RomanToArabImpl();
    private SumFromOneToX sumToX = new SumFromOneToXImpl();

    @Override
    public double calcArithmProgres(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("Argument should be natural number, but: " + n);

        return progrCalc.calc(n);
    }

    @Override
    public boolean hasProgression(int a) {
        if (a < 100)
            throw new IllegalArgumentException("Argument should be positive 3-digit number, but: " + a);

        return progrChecker.hasProgression(a);
    }

    @Override
    public String[] calcFunction(double a, double b, double h) {
        if (b < a)
            throw new IllegalArgumentException(
                    String.format("End bound can't be lower than start bound: [%f, %f]", a, b)
            );

        return calcFunction.calculate(a, b ,h);
    }

    @Override
    public int translateFromRoman(String roman) {
        String rom = roman.toUpperCase();
        if (!roman.matches("[M|D|C|L|X|V|I]*"))
            throw new IllegalArgumentException("Impossible to convert. Wrong roman numeral");

        return romanToArab.translate(roman);
    }

    @Override
    public int calcSumToX(int x) {
        if (x <= 0)
            throw new IllegalArgumentException("Argument should be positive number, but: " + x);

        return sumToX.sum(x);
    }
}
