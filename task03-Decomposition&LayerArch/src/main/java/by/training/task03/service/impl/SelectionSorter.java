package by.training.task03.service.impl;

import by.training.task03.entity.Array;
import by.training.task03.service.Sorter;
import by.training.task03.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SelectionSorter implements Sorter {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public void sort(Array array, boolean isIncreasing) {
        int length = array.getLength();
        if (length == 1)
            return;
        int firstUnsorted = 0;
        for (int i = 0; i < length; i++, firstUnsorted++){
            int toSwap = array.getValue(firstUnsorted);
            int toSwapIndex = firstUnsorted;
            int curr = toSwap;
            for (int j = firstUnsorted + 1; j < length; j++){
                curr = array.getValue(j);
                if (isIncreasing && curr < toSwap || !isIncreasing && curr > toSwap){
                    toSwap = curr;
                    toSwapIndex = j;
                }
            }
            array.swap(firstUnsorted, toSwapIndex);
        }
    }
}
