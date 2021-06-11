package by.training.task02.service;

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


    public static double sin(double x){
        double result = 0;
        int sign = 1;
        double xx = x * x;
        double pw = x;
        double fti = 1.0;
        for(int i = 1; i < 25; i += 2) {
            fti /= i;
            result += sign * pw * fti;
            fti /= ( i + 1 );
            sign = -sign;
            pw  *= xx;
        }
        return result;
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
