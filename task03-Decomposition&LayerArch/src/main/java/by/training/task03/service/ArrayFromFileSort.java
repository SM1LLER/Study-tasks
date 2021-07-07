package by.training.task03.service;

import by.training.task03.entity.Array;
import by.training.task03.service.exception.ServiceException;

/**
 * Sorting of input Array that came from file
 * @author Pavel Kalinin
 */
public interface ArrayFromFileSort {

    /**
     * Sorts input array from file using one of the sort method
     * @param sorters ENUM of sorters that keeps their instances
     * @param filename name of the file where array is located
     * @param isIncreasing direction of the sort, if true - increase, else - decrease
     * @return Array[] Sorted Arrays
     * @throws ServiceException if error occurred during getting information from the file
     */
    public Array[] sort(Sorters sorters, String filename, boolean isIncreasing) throws ServiceException;

    /**
     * Returns unsorted arrays
     * @return Array[] That came on input before sorting
     * @throws ServiceException if method invokes before sort() method
     */
    public Array[] getBeforeSort() throws ServiceException;
}
