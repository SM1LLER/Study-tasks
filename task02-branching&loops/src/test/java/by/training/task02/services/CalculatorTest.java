package by.training.task02.services;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {


    @DataProvider(name = "positiveDataForAbs")
    public Object[][] createPositiveForAbs(){
        return new Object[][]{
                {-1, 1},
                {1, 1},
                {0, 0}
        };
    }

    @DataProvider(name = "positiveDataForSin")
    public Object[][] createPositiveForSin(){
        return new Object[][]{
                {2.0, 0.909},
                {6.0, -0.279},
                {0, 0},
                {-2, -0.909},
                {10.0, 0.737}
        };
    }

    @DataProvider(name = "positiveDataForPowDouble")
    public Object[][] createPositiveForPowDouble(){
        return new Object[][]{
                {2, 4},
                {-2, 4},
                {0, 0},
                {1, 1}
        };
    }
    @DataProvider(name = "positiveDataForAnyPowDouble")
    public Object[][] createPositiveForAnyPowDouble(){
        return new Object[][]{
                {new int[]{2,4}, 16},
                {new int[]{0,4}, 0},
                {new int[]{-2,5}, -32},
                {new int[]{1,10}, 1},
        };
    }
    @DataProvider(name = "positiveDataForFactorial")
    public Object[][] createPositiveForFactorial(){
        return new Object[][]{
                {4, 24},
                {0, 1},
                {6, 720},
                {1, 1}
        };
    }

    @Test(description = "Test with positive result for abs()", dataProvider = "positiveDataForAbs")
    public void testAbs(int a, int c) {
        int expected = c;
        int actual = Calculator.abs(a);
        assertEquals(actual, expected);
    }

    @Test(description = "Test with positive result for sin()", dataProvider = "positiveDataForSin")
    public void testSin(double a, double c) {
        double expected = c;
        double actual = Calculator.sin(a);
        assertEquals(actual, expected,0.1);
    }

    @Test(description = "Test with positive result for powDouble(v)", dataProvider = "positiveDataForPowDouble")
    public void testPowDouble(double a, double c) {
        double expected = c;
        double actual = Calculator.powDouble(a);
        assertEquals(actual, expected, 0.1);
    }

    @Test(description = "Test with positive result for powDouble(v, pow)", dataProvider = "positiveDataForAnyPowDouble")
    public void testAnyPowDouble(int[] a, double c) {
        double expected = c;
        double actual = Calculator.powDouble(a[0], a[1]);
        assertEquals(actual, expected);
    }


    @Test(description = "Test with positive result for factorial()", dataProvider = "positiveDataForFactorial")
    public void testFactorial(int a, int c) {
        int expected = c;
        int actual = Calculator.factorial(a);
        assertEquals(actual, expected);
    }
}