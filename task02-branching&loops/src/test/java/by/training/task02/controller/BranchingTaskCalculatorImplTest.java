package by.training.task02.controller;

import by.training.task02.controller.BranchingTaskCalculator;
import by.training.task02.controller.BranchingTaskCalculatorImpl;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BranchingTaskCalculatorImplTest {

    private BranchingTaskCalculator branchTaskCalc = new BranchingTaskCalculatorImpl();

    @DataProvider(name = "positiveDataForWhichBiggest")
    public Object[][] createPositiveForWhichBiggest(){
        return new Object[][]{
                {new int[]{0, 1}, 1},
                {new int[]{1, 0}, 1},
                {new int[]{-1, 1}, 1},
                {new int[]{-1, 100}, 100},
                {new int[]{100, -1}, 100},
                {new int[]{0, 0}, 0},
                {new int[]{100, 100}, 100}
        };
    }

    @DataProvider(name = "positiveDataForCalcFunction")
    public Object[][] createPositiveForCalcFunction(){
        return new Object[][]{
                {6, 4},
                {-6, 4},
                {0, 0},
                {3, 9},
                {1, 1},
                {1.5, 2.25}
        };
    }

    @DataProvider(name = "positiveDataForDoubleOrAbs")
    public Object[][] createPositiveForDoubleOrAbs(){
        return new Object[][]{
                {new int[]{1, -2, 3}, new int[]{1, 2, 3}},
                {new int[]{-1, 2, 3}, new int[]{1, 2, 3}},
                {new int[]{1, 2, -3}, new int[]{1, 2, 3}},
                {new int[]{0, 0, 0}, new int[]{0, 0, 0}},
                {new int[]{-1, -2, -3}, new int[]{-2, -4, -6}},
                {new int[]{-3, -2, -1}, new int[]{3, 2, 1}}
        };
    }

    @DataProvider(name = "positiveDataForReplaceBiggest")
    public Object[][] createPositiveForReplaceBiggest(){
        return new Object[][]{
                {new int[]{0, 0}, new int[]{0, 0}},
                {new int[]{10, 0}, new int[]{10, 0}},
                {new int[]{0, 10}, new int[]{10, 0}},
                {new int[]{11, 10}, new int[]{11, 10}},
                {new int[]{10, 11}, new int[]{11, 10}},
                {new int[]{-10, 11}, new int[]{11, -10}},
                {new int[]{11, -10}, new int[]{11, -10}},
                {new int[]{-11, -10}, new int[]{-10, -11}},
                {new int[]{-10, -11}, new int[]{-10, -11}}
        };
    }

    @DataProvider(name = "positiveDataForIsTriangleExist")
    public Object[][] createPositiveForIsTriangleExist(){
        return new Object[][]{
                {new double[]{0, 0}, new boolean[]{false, false}},
                {new double[]{0, 10}, new boolean[]{false, false}},
                {new double[]{10, 0}, new boolean[]{false, false}},
                {new double[]{0, 10}, new boolean[]{false, false}},
                {new double[]{10, 10}, new boolean[]{true, false}},
                {new double[]{100, 10}, new boolean[]{true, false}},
                {new double[]{10, 100}, new boolean[]{true, false}},
                {new double[]{179, 1}, new boolean[]{false, false}},
                {new double[]{1, 179}, new boolean[]{false, false}},
                {new double[]{45, 45}, new boolean[]{true, true}},
                {new double[]{89, 1}, new boolean[]{true, true}},
                {new double[]{1, 89}, new boolean[]{true, true}}
        };
    }

    @DataProvider(name = "negativeDataForIsTriangleExist")
    public Object[][] createNegativeForIsTriangleExist(){
        return new Object[][]{
                {new double[]{-1, 1}},
                {new double[]{1, -1}},
        };
    }

    @Test(description = "Test with positive result for whichBiggest()", dataProvider = "positiveDataForWhichBiggest")
    public void testWhichBiggest(int[] a, int c) {
        int expected = c;
        int actual = branchTaskCalc.whichBiggest(a[0], a[1]);
        assertEquals(actual, expected);
    }

    @Test(description = "Test with positive result for calcFunction()", dataProvider = "positiveDataForCalcFunction")
    public void testCalcFunction(double a, double c) {
        double expected = c;
        double actual = branchTaskCalc.calcFunction(a);
        assertEquals(actual, expected);
    }

    @Test(description = "Test with positive result for doubleOrAbs()", dataProvider = "positiveDataForDoubleOrAbs")
    public void testDoubleOrAbs(int[] a, int[] c) {
        int[] expected = c;
        int[] actual = branchTaskCalc.doubleOrAbs(a[0], a[1], a[2]);
        assertEquals(actual, expected);
    }

    @Test(description = "Test with positive result for replaceBiggest()", dataProvider = "positiveDataForReplaceBiggest")
    public void testReplaceBiggest(int[] a, int[] c) {
        int[] expected = c;
        int[] actual = branchTaskCalc.replaceBiggest(a[0], a[1]);
        assertEquals(actual, expected);
    }

    @Test(description = "Test with positive result for isTriangleExist()", dataProvider = "positiveDataForIsTriangleExist")
    public void testPositiveIsTriangleExist(double[] a, boolean[] c) {
        boolean[] expected = c;
        boolean[] actual = branchTaskCalc.isTriangleExist(a[0], a[1]);
        assertEquals(actual, expected);
    }

    @Test(description = "Test with negative result for isTriangleExist()", dataProvider = "negativeDataForIsTriangleExist",
            expectedExceptions = IllegalArgumentException.class)
    public void testNegativeIsTriangleExist(double[] a) {
        branchTaskCalc.isTriangleExist(a[0], a[1]);
    }
}