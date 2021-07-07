package by.training.task03.service.impl;

import by.training.task03.entity.Array;
import by.training.task03.service.Sorter;
import by.training.task03.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BubbleSorter implements Sorter {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public void sort(Array array, boolean isIncreasing) {
        int length = array.getLength();

        if (length == 1)
            return;

        int lastUnsorted = length-1;
        for (int i = 0; i < length-1; i++, lastUnsorted--){
            for(int j = 0; j < lastUnsorted; j++){
                if(isIncreasing && array.getValue(j) > array.getValue(j+1)
                || !isIncreasing && array.getValue(j) < array.getValue(j+1)){
                    array.swap(j, j + 1);
                }
            }
        }
    }
}
