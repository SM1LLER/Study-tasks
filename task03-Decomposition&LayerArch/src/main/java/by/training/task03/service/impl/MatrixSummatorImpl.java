package by.training.task03.service.impl;

import by.training.task03.entity.Matrix;
import by.training.task03.service.MatrixSummator;
import by.training.task03.service.exception.ServiceException;

public class MatrixSummatorImpl implements MatrixSummator {
    @Override
    public Matrix sum(Matrix mtx1, Matrix mtx2) throws ServiceException {
        if(mtx1.getHorizontalSize() != mtx2.getHorizontalSize()
                || mtx1.getVerticalSize() != mtx2.getVerticalSize()){
            throw new ServiceException(new IllegalArgumentException("Matrices should have equal size"));
        }
        int vSize = mtx1.getVerticalSize();
        int hSize = mtx1.getHorizontalSize();
        Matrix result = new Matrix(vSize, hSize);
        for (int i = 0; i < vSize; i++){
            for(int j = 0; j < hSize; j++){
                int el1 = mtx1.getElement(i,j);
                int el2 = mtx2.getElement(i, j);
                result.setElement(i, j, el1 + el2);
            }
        }
        return result;
    }
}
