package by.training.task03.service.impl;

import by.training.task03.entity.Array;
import by.training.task03.service.Sorter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShellSorter implements Sorter {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public void sort(Array array, boolean isIncreasing) {
        int length = array.getLength();
        if (length == 1) {
            return;
        }

        int d = length/2;
        for (int i = 0; i < length && d >= 1; i++){
            for(int k = 0; k < length/d; k++) {
                boolean swapped = false;
                for (int j = d; j < length; j += d) {
                    logger.debug(String.format("Before statement values:%n" +
                                    "length = %d,  d = %d, i = %d, j = %d, array = %s"
                            , length, d, i, j, array.toString())
                    );
                    if (isIncreasing && array.getValue(j) < array.getValue(j - d)
                            || !isIncreasing && array.getValue(j) > array.getValue(j - d)) {
                        array.swap(j, j - d);
                        swapped = true;
                    }
                }
                if (swapped == false){
                    break;
                }
            }
            d /= 2;
        }
    }
}
