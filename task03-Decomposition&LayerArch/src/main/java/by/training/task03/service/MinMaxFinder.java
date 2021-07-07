package by.training.task03.service;

import by.training.task03.entity.Array;

/**
 * Finder used to find maximum or minimum value of element in Array object
 * @author Pavel Kalinin
 */
public class MinMaxFinder {

    /**
     * Finds maximum element of array object
     * @param array where to find max value
     * @return int maximum value of array
     */
    public static int findMax(Array array){
        return findMinMax(array, true);
    }

    /**
     * Finds minimum element of array object
     * @param array where to find min value
     * @return int minimum value of array
     */
    public static int findMin(Array array){
        return findMinMax(array, false);
    }

    /**
     * Helper method that doing main job of finding min/max values
     * @param array where to find min/max value
     * @param isMax true if needs to find maximum value, else false
     * @return int maximum or minimum value
     */
    private static int findMinMax(Array array, boolean isMax){
        int length = array.getLength();
        int minMax = array.getValue(0);
        if (length == 1){
            return minMax;
        }

        for(int i = 0; i < length; i++){
            int curr = array.getValue(i);
            if (isMax && curr > minMax || !isMax && curr < minMax){
                minMax = curr;
            }
        }

        return minMax;

    }
}
