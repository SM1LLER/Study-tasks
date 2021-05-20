package by.training.task01.implementation;

import by.training.task01.interfaces.LinearAlgorithms;
import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LinearAlgorithmsTest {

    private LinearAlgorithms linAlg = new LinearAlgorithmsCalculator();

    @DataProvider(name = "positiveDataForCalcTime")
    public Object[][] createPositiveForCalcTime(){
        return new Object[][]{
                {0, "00ч 00мин 00с."},
                {60, "00ч 01мин 00с."},
                {61, "00ч 01мин 01с."},
                {59, "00ч 00мин 59с."},
                {3600, "01ч 00мин 00с."},
                {3601, "01ч 00мин 01с."},
                {3599, "00ч 59мин 59с."},
                {3660, "01ч 01мин 00с."},
                {3601, "01ч 00мин 01с."}
        };
    }

    @DataProvider(name = "positiveDataForCalcRes")
    public Object[][] createPositiveForCalcResistance(){
        return new Object[][]{
                {new double[]{3.0, 3.0, 3.0}, 1.0},
                {new double[]{500.0, 2.0, 2.0}, 0.998},
        };
    }

    @DataProvider(name = "positiveDataForIsBelongToReg")
    public Object[][] createPositiveForIsBelongToRegion(){
        return new Object[][]{
                {new double[]{0,0}, true},
                {new double[]{1, 0}, true},
                {new double[]{0, 1}, true},
                {new double[]{-1.0, -1.0}, false},
                {new double[]{-1.0, 0}, false},
                {new double[]{0, -1.0}, true}
        };
    }

    @DataProvider(name = "positiveDataForCalcMilkVolume")
    public Object[][] createPositiveForCalcMilkVolume(){
        return new Object[][]{
                {new int[]{1,1}, 92},
                {new int[]{2,1}, 52},
                {new int[]{1,2}, 184},
                {new int[]{2,2}, 104}
        };
    }

    @DataProvider(name = "positiveDataForCalcCircle")
    public Object[][] createPositiveForCalcCircle(){
        return new Object[][]{
                {10, new double[]{62.813, 314}},
                {9, new double[]{56.54867, 254.32}},
                {11, new double[]{69.11504, 254.32}}
        };
    }

    @Test(description = "Test with positive result for calcTime()", dataProvider = "positiveDataForCalcTime")
    public void calcTimeTest(int t, String c){
        String expected = c;
        String actual = linAlg.calcTime(t);
        assertEquals(actual, expected);
    }

    @Test(description = "Test with positive result for calcResistance()", dataProvider = "positiveDataForCalcRes")
    public void calcResistanceTest(double[] r, double c){
        double expected = c;
        double actual = linAlg.calcResistance(r[0], r[1], r[2]);
        assertEquals(actual, expected);
    }

    @Test(description = "Test with positive result for isBelongToRegion()", dataProvider = "positiveDataForIsBelongToReg")
    public void isBelongToRegionTest(double[] p, boolean c){
        boolean expected = c;
        boolean actual = linAlg.isBelongToRegion(p[0], p[1]);
        assertEquals(actual, expected);
    }

    @Test(description = "Test with positive result for calcMilkVolume()", dataProvider = "positiveDataForCalcMilkVolume")
    public void calcMilkVolumeTest(int[] n, double c){
        double expected = c;
        double actual = linAlg.calcMilkVolume(n[0], n[1]);
        assertEquals(actual, expected);
    }

    @Test(description = "Test with positive result for calcCircle()", dataProvider = "positiveDataForCalcCircle")
    public void calcCircleTest(double r, double[] c){
        double[] expected = c;
        double[] actual = linAlg.calcCircle(r);
        assertEquals(actual, expected);
    }

}
