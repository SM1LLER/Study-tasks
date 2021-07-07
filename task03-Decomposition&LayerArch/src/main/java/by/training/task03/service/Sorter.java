package by.training.task03.service;

import by.training.task03.entity.Array;
import by.training.task03.service.exception.ServiceException;

/**
 * Sorter is using to sort elements inside Array object
 * @author Pavel Kalinin
 */
public interface Sorter {
    /**
     * Sorts input array from lower to higher or from higher to lower
     * @param array Array to sort
     * @param isIncreasing true - sort from lower to higher, false - from higher to lower
     */
    void sort(Array array, boolean isIncreasing);
}
