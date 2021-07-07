package by.training.task03.dal;

import by.training.task03.dal.exception.DaoException;
import by.training.task03.entity.Matrix;

import java.util.ArrayList;
import java.util.List;
/**
 * Stores list of matrices in the memory
 */
public class MatrixInMemoryStorage {
    private static MatrixInMemoryStorage instance = new MatrixInMemoryStorage();
    private List<Matrix> storage = new ArrayList<>();

    private MatrixInMemoryStorage(){}

    public static MatrixInMemoryStorage getInstance(){
        return instance;
    }
    /**
     * Adds matrix to the storage
     * @param matrix - matrix that needs to add
     */
    public void addMatrix(Matrix matrix){
        storage.add(matrix);
    }
    /**
     Clears storage
     */
    public void clear(){
        storage.clear();
    }
    /**
     * Returns size of the storage
     * @return size - int size of the storage
     */
    public int getSize(){
        return storage.size();
    }

    /**
     * Returns element by its index
     * @param n - index of the element
     * @return Matrix - element
     * @throws DaoException if storage is empty
     */
    public Matrix getElement(int n) throws DaoException {
        if (storage.isEmpty()){
            throw new DaoException("Storage is empty");
        }
        return storage.get(n);
    }
}
