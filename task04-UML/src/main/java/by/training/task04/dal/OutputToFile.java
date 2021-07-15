package by.training.task04.dal;

import by.training.task04.dal.exception.DaoException;

import java.util.List;

/**
 * Writes information to file that user can access
 * @author Pavel Kalinin
 */
public interface OutputToFile {

    /**
     * Adds text information to file
     * @param data list of strings that add to file
     * @param fileName Name of the output file
     * @throws DaoException if erorr occurs during output procces
     */
    public void writeTo(List<String> data, String fileName) throws DaoException;
}
