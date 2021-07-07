package by.training.task03.dal.factory;

import by.training.task03.dal.*;

public final class DaoFactory {
    private static final DaoFactory instance = new DaoFactory();

    private final ArrayDao arrayDao = new ArrayDaoImpl();
    private final MatrixDao matrixDao = new MatrixDaoImpl();

    private DaoFactory(){}

    public static DaoFactory getInstance(){
        return instance;
    }

    public ArrayDao getArrayDao() {
        return arrayDao;
    }

    public MatrixDao getMatrixDao() {
        return matrixDao;
    }
}
