package by.training.task03.dal;

import by.training.task03.dal.exception.DaoException;
import by.training.task03.entity.Array;
/**
 * Reads arrays from given file
 * @author Pavel Kalinin
 */
public interface ArrayDao {
    /**
     * Returns array that stores in the file
     * @param filename - Name of the file to check
     * @throws DaoException if file doesnt exists or empty
     */
    Array[] getArrays(String filename) throws DaoException;
}
