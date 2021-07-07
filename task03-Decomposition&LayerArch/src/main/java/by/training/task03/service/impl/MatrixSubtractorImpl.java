package by.training.task03.service.impl;

import by.training.task03.entity.Matrix;
import by.training.task03.service.MatrixSubtractor;
import by.training.task03.service.exception.ServiceException;

public class MatrixSubtractorImpl implements MatrixSubtractor {
    @Override
    public Matrix subtract(Matrix minuend, Matrix subtraend) throws ServiceException{
        if(minuend.getHorizontalSize() != subtraend.getHorizontalSize()
                && minuend.getVerticalSize() != subtraend.getVerticalSize()){
            throw new ServiceException(new IllegalArgumentException("Matrices should have equal size"));
        }
        int vSize = minuend.getVerticalSize();
        int hSize = subtraend.getHorizontalSize();
        Matrix result = new Matrix(vSize, hSize);
        for (int i = 0; i < vSize; i++){
            for(int j = 0; j < hSize; j++){
                int el1 = minuend.getElement(i,j);
                int el2 = subtraend.getElement(i, j);
                result.setElement(i, j, el1 - el2);
            }
        }
        return result;
    }
}
