package by.training.task01.interfaces;

/**
 * Represents solutions for tasks 22, 30, 38, 6, 14
 * @author Pavel Kalinin
 */
public interface LinearAlgorithm {

    /**
     * Calculates time from given seconds
     * and displays it in the form - HHч. MMмин. SSc.
     * @param sec Time in seconds
     * @return String that represents time in hours, minutes and seconds
     */
    String calcTime(int sec);

    /**
     * Calculates resistance of parallel connected resistors
     * @param r1 Resistance of R1
     * @param r2 Resistance of R2
     * @param r3 Resistance of R3
     * @return Their full resistance
     */
    double calcResistance(double r1, double r2, double r3);

    /**
     * Checks does given point (x,y) belong to the region c)
     * @param x
     * @param y
     * @return True if point belongs to one of the region
     * and false if not
     */
    boolean isBelongToRegion(double x, double y);

    /**
     * Calculates the volume of milk in big milk cans
     * from the quantity of small ones
     * @param n Number of the small milk cans
     * @param m Number of the big milk cans
     * @return Volume of milk in the big milk cans
     */
    double calcMilkVolume(int n, int m);

    /**
     * Calculates length and area of the circle with
     * radius R
     * @param r Radius of the circle
     * @return Array with 2 elements, where [0] is length
     * [1] is area
     */
    double[] calcCircle(double r);
}
