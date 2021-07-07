package by.training.task03.service;

import by.training.task03.entity.Matrix;
import by.training.task03.service.exception.ServiceException;
/**
 * Class for subtraction two matrices
 * @author Pavel Kalinin
 */
public interface MatrixSubtractor {

    /**
     * Subtract matrices
     * @param minuend matrix
     * @param subtraend matrix
     * @throws ServiceException if matrices have different sizes
     */
    Matrix subtract(Matrix minuend, Matrix subtraend) throws ServiceException;
}
