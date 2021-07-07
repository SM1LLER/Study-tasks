package by.training.task03.service.impl;

import by.training.task03.entity.Matrix;
import by.training.task03.service.MatrixMultiplicator;
import by.training.task03.service.exception.ServiceException;

public class MatrixMultiplicatorImpl implements MatrixMultiplicator {
    @Override
    public Matrix multiply(Matrix mtx1, Matrix mtx2) throws ServiceException {
        int vSize = 0;
        int hSize = 0;
        int n = 0;
        if(mtx1.getVerticalSize() == mtx2.getHorizontalSize()){
            n = mtx1.getVerticalSize();
            vSize = mtx2.getVerticalSize();
            hSize = mtx1.getHorizontalSize();
        } else if(mtx1.getHorizontalSize() == mtx2.getVerticalSize()) {
            n = mtx1.getHorizontalSize();
            vSize = mtx1.getVerticalSize();
            hSize = mtx2.getHorizontalSize();
        } else{
            throw new ServiceException(new IllegalArgumentException("Matrices should be agreed"));
        }
        Matrix result = new Matrix(vSize, hSize);
        for (int i = 0; i < vSize; i++){
            for (int j = 0; j < hSize; j++) {
                int mply = 0;
                for (int k = 0; k < n; k++){
                    int el1 = mtx1.getElement(i, k);
                    int el2 = mtx2.getElement(k, j);
                    mply += el1 * el2;
                }
                result.setElement(i, j, mply);
            }
        }
        return result;
    }

    @Override
    public Matrix multiply(Matrix mtx, int num) {
        int vSize = mtx.getVerticalSize();
        int hSize = mtx.getHorizontalSize();
        Matrix result = new Matrix(vSize, hSize);
        for (int i = 0; i < vSize; i++){
            for(int j = 0; j < hSize; j++){
                int el = mtx.getElement(i,j);
                result.setElement(i, j, el * num);
            }
        }
        return result;
    }
}
