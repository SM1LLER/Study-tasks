package by.training.task01.interfaces;

/**
 * Represents solutions for tasks 22, 30, 38, 6, 14
 * Input data here provides user
 * @author Pavel Kalinin
 */
public interface LinearAlgorithmUI {

    /**
     * Calculates time from given seconds
     * and displays it in the form - HHч. MMмин. SSc.
     * @return String that represents time in hours, minutes and seconds
     */
    String calcTime();

    /**
     * Calculates resistance of parallel connected resistors
     * @return Their full resistance
     */
    double calcResistance();

    /**
     * Checks does given point (x,y) belong to the region c)
     * @return True if point belongs to one of the region
     * and false if not
     */
    boolean isBelongToRegion();

    /**
     * Calculates the volume of milk in big milk cans
     * from the quantity of small ones
     * @return Volume of milk in the big milk cans
     */
    double calcMilkVolume();

    /**
     * Calculates length and area of the circle with
     * radius R
     * @return Array with 2 elements, where [0] is length
     * [1] is area
     */
    double[] calcCircle();
}
