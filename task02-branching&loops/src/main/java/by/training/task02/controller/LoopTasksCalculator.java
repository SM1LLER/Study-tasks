package by.training.task02.controller;

/**
 * Represents solutions for task 6, 14, 22, 30, 38 with loops:
 * @author Pavel Kalinin
 */
public interface LoopTasksCalculator {

    /**
     * Calculates Sn of the row 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
     * @param n Number of elements to sum
     * @return double - sum of the elements from 1 to n of the row
     */
    double calcArithmProgres(int n);

    /**
     * Checks does digits of given number create arithmetic progression
     * @param a Number to check
     * @return true if digits create progression, else false
     */
    boolean hasProgression(int a);

    /**
     * Calculate function F(x), where x belongs [a,b] and increases at h
     * @param a start bound
     * @param b end bound
     * @param h step of the growing
     * @return Array of the string where each element represents one line of the table
     */
    String[] calcFunction(double a, double b, double h);

    /**
     * Translates given string from roman to arabic number
     * @param roman Roman number
     * @return int result of translation to arabic number
     */
    int translateFromRoman(String roman);

    /**
     * Sums digits from 1 to given number
     * @param x end bound
     * @return integer - sum of the elements from 1 to x
     */
    int calcSumToX(int x);
}
