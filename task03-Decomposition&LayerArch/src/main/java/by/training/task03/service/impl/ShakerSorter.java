package by.training.task03.service.impl;

import by.training.task03.entity.Array;
import by.training.task03.service.Sorter;
import by.training.task03.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShakerSorter implements Sorter {

    private static final Logger shakerLogger = LogManager.getLogger();

    @Override
    public void sort(Array array, boolean isIncreasing) {
        int length = array.getLength();
        if (length == 1){
            return;
        }

        int leftBound = 0;
        int rightBound = length - 1;
        int start = leftBound;
        int end = rightBound;
        int dir = 1;
        for (int i = 0; i < length/2 + 1; i++){
            for (int j = start; j != end; j += dir){
                shakerLogger.debug(String.format("Before statement values:%n" +
                        "leftBound = %d, rightBound = %d, start = %d, end = %d, dir = %d, i = %d, j = %d"
                        , leftBound, rightBound, start, end, dir, i, j)
                );

                if (dir == 1){
                    if(isIncreasing && array.getValue(j) > array.getValue(j + dir)
                        || !isIncreasing && array.getValue(j) < array.getValue(j + dir)
                    ){
                        array.swap(j, j + dir);
                    }
                } else if (isIncreasing && array.getValue(j) < array.getValue(j + dir)
                        || !isIncreasing && array.getValue(j) > array.getValue(j + dir)
                ){
                    array.swap(j, j + dir);
                }
            }
            if (dir == 1){
                rightBound--;
                start = rightBound;
                end = leftBound;
                dir = -1;
            } else {
                leftBound++;
                start = leftBound;
                end = rightBound;
                dir = 1;
            }
        }
    }
}
