package by.training.task02.services;

/**
 * Represents solutions for task 6, 14, 22, 30, 38 with branching statements:
 * @author Pavel Kalinin
 */
public interface BranchingTaskCalculator {

    /**
     * Returns the biggest of two values.
     * @param a
     * @param b
     * @return The biggest of two integers
     */
    int whichBiggest(int a, int b);

    /**
     * Calculates function F(x). Which function to use depends on input value.
     * @param x
     * @return If 0 <= x <= 3, than returns x^2, else returns 4
     */
    double calcFunction(double x);

    /**
     * Checks does a < b < c and manipulates with input depends on result
     * @param a
     * @param b
     * @param c
     * @return Array, where indexes [0-2] is [a-c]. If a < b < c than doubles input parameteres,
     * else it returns it absolute value
     */
    int[] doubleOrAbs(int a, int b, int c);

    /**
     * Swaps values if y bigger than x
     * @param x
     * @param y
     * @return Array of integer where indexes [0], [1] are [x], [y]
     */
    int[] replaceBiggest(int x, int y);

    /**
     * Checks does exist triangle with given angles
     * and if it does than checks is it right triangle
     * @param a first angle
     * @param b second angle
     * @return Array of boolean where [0],[1] are [isTriangle][isRight]
     */
    boolean[] isTriangleExist(double a, double b);
}
