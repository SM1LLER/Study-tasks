package by.training.task02.controller;

import by.training.task02.controller.LoopTasksCalculator;
import by.training.task02.controller.LoopTasksCalculatorImpl;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoopTasksCalculatorImplTest {

    private LoopTasksCalculator loopTasksCalculator = new LoopTasksCalculatorImpl();
    @DataProvider(name = "positiveDataForCalcArithmProgres")
    public Object[][] createPositiveForCalcArithmProgres(){
        return new Object[][]{
                {4, 2.08},
                {1, 1},
                {3, 1.83},
        };
    }

    @DataProvider(name = "negativeDataForCalcArithmProgres")
    public Object[][] createNegativeForCalcArithmProgres(){
        return new Object[][]{
                {0},
                {-1},
        };
    }

    @DataProvider(name = "positiveDataForHasProgression")
    public Object[][] createPositiveForHasProgression(){
        return new Object[][]{
                {2468, true},
                {8642, true},
                {100, false},
                {2469, false},
                {9642, false},
                {1234567, true},
                {7654321, true},
        };
    }

    @DataProvider(name = "negativeDataForHasProgression")
    public Object[][] createNegativeForHasProgression(){
        return new Object[][]{
                {0},
                {99},
                {98},
                {-1},
                {-100},
                {-101},
                {-99},
        };
    }

//    @DataProvider(name = "positiveDataForCalcFunction")
//    public Object[][] createPositiveForCalcFunction(){
//        return new Object[][]{
//                {new double[]{0, 11, 10}, new String[]{"0.0\t0.0","10.0\t0.544"}},
//        };
//    }

    @DataProvider(name = "negativeDataForCalcFunction")
    public Object[][] createNegativeForCalcFunction(){
        return new Object[][]{
                {new double[]{11, 10, 1}},
        };
    }

    @DataProvider(name = "positiveDataForTranslateFromRoman")
    public Object[][] createPositiveForTranslateFromRoman(){
        return new Object[][]{
                {"I", 1},
                {"V", 5},
                {"X", 10},
                {"L", 50},
                {"C", 100},
                {"D", 500},
                {"M", 1000},
                {"XIX", 19},
                {"XI", 11},
        };
    }

    @DataProvider(name = "negativeDataForTranslateFromRoman")
    public Object[][] createNegativeForTranslateFromRoman(){
        return new Object[][]{
                {"R"},
                {"XR"},
        };
    }

    @DataProvider(name = "positiveDataForCalcSumToX")
    public Object[][] createPositiveForCalcSumToX(){
        return new Object[][]{
                {10, 45},
                {1, 0},
                {2, 1},
        };
    }

    @DataProvider(name = "negativeDataForCalcSumToX")
    public Object[][] createNegativeForCalcSumToX(){
        return new Object[][]{
                {-1},
                {-10},
        };
    }



    @Test(description = "Test with positive result for arithmProgres()", dataProvider = "positiveDataForCalcArithmProgres")
    public void testPositiveCalcArithmProgres(int a, double c) {
        double expected = c;
        double actual = loopTasksCalculator.calcArithmProgres(a);
        assertEquals(actual, expected, 0.1);
    }

    @Test(description = "Test with negative result for arithmProgres()", dataProvider = "negativeDataForCalcArithmProgres",
            expectedExceptions = IllegalArgumentException.class)
    public void testNegativeCalcArithmProgres(int a) {

        loopTasksCalculator.calcArithmProgres(a);
    }

    @Test(description = "Test with positive result for hasProgression()", dataProvider = "positiveDataForHasProgression")
    public void testPositiveHasProgression(int a, boolean c) {
        boolean expected = c;
        boolean actual = loopTasksCalculator.hasProgression(a);
        assertEquals(actual, expected);
    }

    @Test(description = "Test with negative result for hasProgression()", dataProvider = "negativeDataForHasProgression",
            expectedExceptions = IllegalArgumentException.class)
    public void testNegativeHasProgression(int a) {

        loopTasksCalculator.hasProgression(a);
    }

//    @Test(description = "Test with positive result for calcFunction()", dataProvider = "positiveDataForCalcFunction")
//    public void testPositiveCalcFunction(double[] a, String[] c) {
//        String[] expected = c;
//        String[] actual = loopTasksCalculator.calcFunction(a[0], a[1], a[2]);
//        assertEquals(actual, expected);
//    }

    @Test(description = "Test with negative result for calcFunction()", dataProvider = "negativeDataForCalcFunction",
            expectedExceptions = IllegalArgumentException.class)
    public void testNegativeCalcFunction(double[] a) {

        loopTasksCalculator.calcFunction(a[0], a[1], a[2]);
    }

    @Test(description = "Test with positive result for translateFromRoman()", dataProvider = "positiveDataForTranslateFromRoman")
    public void testPositiveTranslateFromRoman(String a, int c) {
        int expected = c;
        int actual = loopTasksCalculator.translateFromRoman(a);
        assertEquals(actual, expected);
    }

    @Test(description = "Test with negative result for translateFromRoman()", dataProvider = "negativeDataForTranslateFromRoman",
            expectedExceptions = IllegalArgumentException.class)
    public void testNegativeTranslateFromRoman(String a) {

        loopTasksCalculator.translateFromRoman(a);
    }

    @Test(description = "Test with positive result for calcSumToX()", dataProvider = "positiveDataForCalcSumToX")
    public void testPositiveCalcSumToX(int a, int c) {
        int expected = c;
        int actual = loopTasksCalculator.calcSumToX(a);
        assertEquals(actual, expected);
    }

    @Test(description = "Test with negative result for calcSumToX()", dataProvider = "negativeDataForCalcSumToX",
            expectedExceptions = IllegalArgumentException.class)
    public void testNegativeCalcSumToX(int a) {

        loopTasksCalculator.calcSumToX(a);
    }
}