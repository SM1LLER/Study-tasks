package by.training.task03.service;

import by.training.task03.entity.Matrix;
import by.training.task03.service.exception.ServiceException;
/**
 * Class for sum matrices
 * @author Pavel Kalinin
 */
public interface MatrixSummator {
    /**
     * Sums matrices
     * @param mtx1 first matrix
     * @param mtx2 second matrix
     * @throws ServiceException if matrices have different sizes
     */
    Matrix sum(Matrix mtx1, Matrix mtx2) throws ServiceException;
}
