package by.training.loop.services;

/**
 * Represents solution for task 14:
 * Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
 * @author Pavel Kalinin
 */
public interface CalcArithmProgr {

    /**
     * Calculates Sn of the row 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
     * @param n Number of elements to sum
     * @return double - sum of the elements from 1 to n of the row
     */
    double calc(int n);
}
