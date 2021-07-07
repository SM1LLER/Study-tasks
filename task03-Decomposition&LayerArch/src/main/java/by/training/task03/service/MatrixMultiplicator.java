package by.training.task03.service;

import by.training.task03.entity.Matrix;
import by.training.task03.service.exception.ServiceException;
/**
 * Class for matrix multiplication with number or another matrix
 * @author Pavel Kalinin
 */
public interface MatrixMultiplicator {
    /**
     * Multiplies matrices
     * @param mtx1 first matrix
     * @param mtx2 second matrix
     * @throws ServiceException if matrices are not agreed
     */
    Matrix multiply(Matrix mtx1, Matrix mtx2) throws ServiceException;
    /**
     * Multiplies matrix and number
     * @param mtx matrix
     * @param num multiplication number
     */
    Matrix multiply(Matrix mtx, int num);
}
