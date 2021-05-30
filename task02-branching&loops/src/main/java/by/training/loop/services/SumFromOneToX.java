package by.training.loop.services;

/**
 * Represents solution for task 6:
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа
 * суммирует все числа от 1 до введенного пользователем числа.
 * @author Pavel Kalinin
 */
public interface SumFromOneToX {

    /**
     * Sums digits from 1 to given number
     * @param x end bound
     * @return integer - sum of the elements from 1 to x
     */
    int sum(int x);
}
