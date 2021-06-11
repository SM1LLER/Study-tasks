package by.training.task02.dal;

/**
 * Converts strings from given file to double or int
 * @author Pavel Kalinin
 */
public interface FromStrToNumTrans {

    /**
     * Converts strings from file to double
     * @param fileName Name of the input file
     * @return Integer array of arrays where each array is one string from the file
     */
    double[][] getDoubleFrom(String fileName);

    /**
     * Converts strings from file to integer
     * @param fileName Name of the input file
     * @return Integer array of arrays where each array is one string from the file
     */
    int[][] getIntFrom(String fileName);
}
