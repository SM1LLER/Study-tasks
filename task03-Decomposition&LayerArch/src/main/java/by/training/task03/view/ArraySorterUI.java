package by.training.task03.view;

import by.training.task03.entity.Array;

/**
 * View class that speaks with user to sort Arrays
 * @author Pavel Kalinin
 */
public interface ArraySorterUI {

    /**
     * Saves input array before sorting
     * @param arrays array that comes before sort
     */
    void setInput(Array[] arrays);
    /**
     * Saves output array after sortin
     * @param arrays result array of the sort
     */
    void setOutput(Array[] arrays);
    /**
     * Prints input and output array for the user
     */
    void printResponse();

}
