package by.training.task03.service.impl;

import by.training.task03.dal.MatrixInMemoryStorage;
import by.training.task03.dal.exception.DaoException;
import by.training.task03.dal.factory.DaoFactory;
import by.training.task03.entity.Matrix;
import by.training.task03.service.MatrixMultiplicator;
import by.training.task03.service.MatrixStorageActions;
import by.training.task03.service.MatrixSubtractor;
import by.training.task03.service.MatrixSummator;
import by.training.task03.service.exception.ServiceException;

import java.util.List;

public class MatrixStorageActionsImpl implements MatrixStorageActions {
    DaoFactory daoFactory = DaoFactory.getInstance();
    MatrixInMemoryStorage storage = MatrixInMemoryStorage.getInstance();

    @Override
    public List<Matrix> loadToMem(String fileName) throws ServiceException {
        List<Matrix> matrixList = null;
        try {
           matrixList = daoFactory.getMatrixDao().getMatrices(fileName);
        } catch (DaoException e){
            throw new ServiceException(e);
        }
        storage.clear();
        for(Matrix mtx : matrixList){
            storage.addMatrix(mtx);
        }
        return matrixList;
    }

    public Matrix multiply() throws ServiceException{
        MatrixMultiplicator multiplicator = new MatrixMultiplicatorImpl();
        Matrix result = null;
        try {
            result = storage.getElement(0);
            for(int i = 1; i < storage.getSize(); i++) {
                result = multiplicator.multiply(result, storage.getElement(i));
            }
        } catch (DaoException e){
            throw new ServiceException(e);
        }
        return result;
    }

    public Matrix subtract() throws ServiceException{
        MatrixSubtractor subtractor = new MatrixSubtractorImpl();
        Matrix result = null;
        try {
            result = storage.getElement(0);
            for(int i = 1; i < storage.getSize(); i++) {
                result = subtractor.subtract(result, storage.getElement(i));
            }
        } catch (DaoException e){
            throw new ServiceException(e);
        }
        return result;
    }

    public Matrix sum() throws ServiceException{
        MatrixSummator summator = new MatrixSummatorImpl();
        Matrix result = null;
        try{
            result = storage.getElement(0);
            for(int i = 1; i < storage.getSize(); i++){
                result = summator.sum(result, storage.getElement(i));
            }
        } catch (DaoException e){
            throw new ServiceException(e);
        }
        return result;
    }
}
