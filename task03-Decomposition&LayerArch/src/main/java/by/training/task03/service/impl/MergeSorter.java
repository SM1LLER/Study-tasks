package by.training.task03.service.impl;

import by.training.task03.entity.Array;
import by.training.task03.service.Sorter;
import by.training.task03.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MergeSorter implements Sorter {
    private static final Logger logger = LogManager.getLogger();
    @Override
    public void sort(Array array, boolean isIncreasing) {
        if (array.getLength() == 1){
            return;
        }

        Array leftArr = array.getSubArray(0, array.getLength()/2);
        Array rightArr = array.getSubArray(array.getLength()/2, array.getLength());

        sort(leftArr, isIncreasing);
        sort(rightArr, isIncreasing);

        merge(array, leftArr, rightArr, isIncreasing);

    }

    private void merge(Array arr, Array leftArr, Array rightArr, boolean isIncreasing){
        int leftSize = leftArr.getLength();
        int leftMarker = 0;
        int leftValue = leftArr.getValue(0);
        int rightSize = rightArr.getLength();
        int rightMarker = 0;
        int rightValue = rightArr.getValue(0);
        for (int i = 0; i < arr.getLength(); i++){
            if (leftMarker == leftSize){
                arr.setValue(rightArr.getValue(rightMarker), i);
                rightMarker++;
                continue;
            }

            if (rightMarker == rightSize){
                arr.setValue(leftArr.getValue(leftMarker), i);
                leftMarker++;
                continue;
            }

            if (isIncreasing && leftValue < rightValue
                    || !isIncreasing && leftValue > rightValue
            ){
                arr.setValue(leftValue, i);
                leftValue = (++leftMarker < leftSize) ? leftArr.getValue(leftMarker) : 0;
            } else {
                arr.setValue(rightValue, i);
                rightValue = (++rightMarker < rightSize) ? rightArr.getValue(rightMarker) : 0;
            }
        }
    }
}
