package by.training.task02.services;

/**
 * Gives useful mathematics functions to help find the solution of the given tasks
 * @author Pavel Kalinin
 */
public class Calculator{

    private Calculator(){}

    /**
     * Calculates absolute value of the given number
     * @param a number to calculate
     * @return absolute value of a
     */
    public static int abs(int a) {
        return a >= 0 ? a : -a;
    }

    /**
     * Calculates sine of the given number
     * @param x number to calculate
     * @return double - sine of x
     */
    public static double sin(double x) {
        final int PRECISION = 10;
        final double PI = 3.1415926535;

        double angle = x;
        angle %= 2 * PI;

        if (angle < 0) {
            angle = 2 * PI - angle;
        }

        int sine = 1;
        if (angle > PI) {
            angle -= PI;
            sine = -1;
        }

        double temp = 0;
        for (int i = 0; i <= PRECISION; i++) {
            temp += powDouble(-1, i) * (powDouble(angle, 2 * i + 1) / factorial(2 * i + 1));
        }

        return sine * temp;

    }

    /**
     * Square given double value
     * @param value
     * @return square of value
     */
    public static double powDouble(double value){

        return value * value;
    }

    /**
     * Raises given value to the any natural number power
     * @param value
     * @param power
     * @return double - raise of value to to the power of given power
     */
    public static double powDouble(double value, int power){
        double result = 1.0;
        for (int i = 1; i <= power; i++) {
            result = result * value;
        }
        return result;
    }

    /**
     * Calculates factorial of the given number
     * @param x natural number
     * @return factorial of the x
     */
    public static int factorial(int x){
        int fact = 1;
        for(int i = 2; i <= x; i++){
            fact *= i;
        }
        return fact;
    }
}
