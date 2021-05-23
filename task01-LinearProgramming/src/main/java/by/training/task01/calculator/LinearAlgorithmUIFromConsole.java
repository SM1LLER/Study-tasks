package by.training.task01.calculator;

import by.training.task01.interfaces.LinearAlgorithm;
import by.training.task01.interfaces.LinearAlgorithmUI;

import java.util.Scanner;

/**
 * Implementation of LinearAlgorithmUI with input from console
 * @author Pavel Kalinin
 */
public class LinearAlgorithmUIFromConsole implements LinearAlgorithmUI {

    private LinearAlgorithm linearAlgorithm = new LinearAlgorithmCalculator();
    private Scanner in = new Scanner(System.in);

    @Override
    public String calcTime() {

        System.out.print("Input seconds: ");
        int seconds = in.nextInt();

        String output = linearAlgorithm.calcTime(seconds);
        System.out.println("Time is " + output);

        return output;
    }

    @Override
    public double calcResistance() {

        System.out.print("Input R1: ");
        double r1 = in.nextDouble();
        System.out.print("Input R2: ");
        double r2 = in.nextDouble();
        System.out.print("Input R3: ");
        double r3 = in.nextDouble();

        double result = linearAlgorithm.calcResistance(r1, r2, r3);
        System.out.println("Full resistance is " + result);

        return result;
    }

    @Override
    public boolean isBelongToRegion() {

        System.out.println("Input x: ");
        double x = in.nextDouble();
        System.out.println("Input y: ");
        double y = in.nextDouble();

        boolean result = linearAlgorithm.isBelongToRegion(x, y);
        System.out.println("That point belongs to region: " + result);

        return result;
    }

    @Override
    public double calcMilkVolume() {

        System.out.println("Input n: ");
        int n = in.nextInt();
        System.out.println("Input m: ");
        int m = in.nextInt();

        double result = linearAlgorithm.calcMilkVolume(n, m);
        System.out.println("Milk volume in big cans is " + result);

        return result;
    }

    @Override
    public double[] calcCircle() {
        System.out.println("Input R: ");
        double r = in.nextDouble();

        double[] result = linearAlgorithm.calcCircle(r);
        System.out.printf("Length of the circle is: %f; area is: %f%n", result[0], result[1]);

        return result;
    }
}
