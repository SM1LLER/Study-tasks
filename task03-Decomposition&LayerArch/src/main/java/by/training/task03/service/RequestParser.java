package by.training.task03.service;

/**
 * Sorter is using to sort elements inside Array object
 * @author Pavel Kalinin
 */
public interface RequestParser {
    /**
     * Finds file name from input request
     * @param request
     * @return String file name
     */
    String getFileName(String request);
    /**
     * Finds does sort increasing or not from input request
     * @param request
     * @return boolean is increasing or not
     */
    boolean getIsIncreasing(String request);
}
