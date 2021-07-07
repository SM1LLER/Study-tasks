package by.training.task03.dal;

import by.training.task03.dal.exception.DaoException;
import by.training.task03.entity.Matrix;

import java.util.List;
/**
 * Reads matrices that stores in the file
 * @author Pavel Kalinin
 */
public interface MatrixDao {
    /**
     * Returns List of matrices that store in the file
     * @param fileName - Name of the file to check
     * @throws DaoException if file doesnt exists or empty
     */
    List<Matrix> getMatrices(String fileName) throws DaoException;
}
