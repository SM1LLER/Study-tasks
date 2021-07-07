package by.training.task03.service.impl;

import by.training.task03.dal.exception.DaoException;
import by.training.task03.dal.factory.DaoFactory;
import by.training.task03.entity.Array;
import by.training.task03.service.ArrayFromFileSort;
import by.training.task03.service.Sorter;
import by.training.task03.service.Sorters;
import by.training.task03.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayFromFileSortImpl implements ArrayFromFileSort {
    private static final Logger arraySortLogger = LogManager.getLogger();
    private DaoFactory daoFactory = DaoFactory.getInstance();
    private Array[] beforeSort = null;

    @Override
    public Array[] sort(Sorters sorters, String filename, boolean isIncreasing) throws ServiceException {
        Array[] inputArrays;
        try{
            inputArrays = daoFactory.getArrayDao().getArrays(filename);
        } catch (DaoException e){
            throw new ServiceException(e);
        }


        saveArrays(inputArrays);
        Sorter sorter = sorters.getSorter();

        int i = 0;
        for(Array array : inputArrays){
            arraySortLogger.debug(i + " array" + array.toString());
            sorter.sort(array, isIncreasing);
        }

        return inputArrays;
    }

    public Array[] getBeforeSort() throws ServiceException{
        if(beforeSort == null){
            throw new ServiceException("Needs to invoke sort() method first");
        }
        return beforeSort;
    }

    private void saveArrays(Array[] arrays){
        beforeSort = new Array[arrays.length];
        int i = 0;
        for(Array array : arrays){
            beforeSort[i++] = array.clone();
        }
    }
}
