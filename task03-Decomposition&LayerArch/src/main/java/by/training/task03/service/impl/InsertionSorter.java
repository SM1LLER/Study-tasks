package by.training.task03.service.impl;

import by.training.task03.entity.Array;
import by.training.task03.service.Sorter;
import by.training.task03.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InsertionSorter implements Sorter {
    private static final Logger logger = LogManager.getLogger();
    @Override
    public void sort(Array array, boolean isIncreasing) {
        int length = array.getLength();

        if (length == 1){
            return;
        }

        int curr;
        for (int i = 1; i < length; i++){
            curr = array.getValue(i);
            for (int j = i-1;
                 j >= 0 && (isIncreasing && curr < array.getValue(j)
                            || !isIncreasing && curr > array.getValue(j));
                 j--)
            {
                array.swap(j, j+1);
            }
        }
    }
}
