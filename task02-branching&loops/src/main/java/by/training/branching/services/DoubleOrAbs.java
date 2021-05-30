package by.training.branching.services;

/**
 * Represents solution for task 30:
 * Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с,
 * и заменить их абсолютными значениями, если это не так
 * @author Pavel Kalinin
 */
public interface DoubleOrAbs {

    /**
     * Checks does a < b < c and manipulates with input depends on result
     * @param a
     * @param b
     * @param c
     * @return Array, where indexes [0-2] is [a-c]. If a < b < c than doubles input parameteres,
     * else it returns it absolute value
     */
    int[] calculate(int a, int b, int c);
}
