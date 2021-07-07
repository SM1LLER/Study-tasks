package by.training.task03.service;

import by.training.task03.entity.Matrix;
import by.training.task03.service.exception.ServiceException;

import java.util.List;

/**
 * Basic actions on the matrix inside of the storage
 * @author Pavel Kalinin
 */
public interface MatrixStorageActions {
    /**
     * Loads matrices from file to memory
     * @param fileName name of the file where matrices locates
     * @return List<Matrix> - List of matrices added to memmory
     * @throws ServiceException if error occurred during getting information from the file
     */
    public List<Matrix> loadToMem(String fileName) throws ServiceException;

    /**
     * Multiplys all elemnts of the storage
     * @return Matrix result of the multiplication
     * @throws ServiceException if error occurred during getting information from the storage
     */
    public Matrix multiply() throws ServiceException;

    /**
     * Subtracts all elemnts of the storage
     * @return Matrix result of the subtraction
     * @throws ServiceException if error occurred during getting information from the storage
     */
    public Matrix subtract() throws ServiceException;

    /**
     * Sums all elemnts of the storage
     * @return Matrix result of the sum;
     * @throws ServiceException if error occurred during getting information from the storage
     */
    public Matrix sum() throws ServiceException;
}
