package by.training.task04.dal;

import by.training.task04.dal.exception.DaoException;

import java.util.List;

/**
 * Reads information from input file that user can access
 * @author Pavel Kalinin
 */
public interface InputFromFile {

    /**
     * Returns text information from the file
     * @param fileName Name of the input file
     * @return List of strings that represents content of the input file where each element is one line
     */
    List<String> readFrom(String fileName) throws DaoException;
}
