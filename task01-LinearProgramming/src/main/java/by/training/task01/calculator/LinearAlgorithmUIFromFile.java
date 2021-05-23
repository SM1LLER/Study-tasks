package by.training.task01.calculator;

import by.training.task01.dal.InputFromFileFirstLine;
import by.training.task01.interfaces.InputFromFile;
import by.training.task01.interfaces.LinearAlgorithm;
import by.training.task01.interfaces.LinearAlgorithmUI;

/**
 * Implementation of LinearAlgorithmUI with input from file
 * @author Pavel Kalinin
 */
public class LinearAlgorithmUIFromFile implements LinearAlgorithmUI {
    private LinearAlgorithm linearAlgorithm = new LinearAlgorithmCalculator();
    private InputFromFile inputFromFile = new InputFromFileFirstLine();

    @Override
    public String calcTime() {
        String in = inputFromFile.getInput("timeInput.txt");
        int sec = Integer.parseInt(in);

        String output = linearAlgorithm.calcTime(sec);
        System.out.println("Time is " + output);

        return output;
    }

    @Override
    public double calcResistance() {
        String[] in = inputFromFile.getInput("resistanseInput.txt")
                                    .split("\\s");
        double r1 = Double.parseDouble(in[0]);
        double r2 = Double.parseDouble(in[1]);
        double r3 = Double.parseDouble(in[2]);

        double result = linearAlgorithm.calcResistance(r1, r2, r3);
        System.out.println("Full resistance is " + result);

        return result;
    }

    @Override
    public boolean isBelongToRegion() {
        String[] in = inputFromFile.getInput("pointInput.txt")
                .split("\\s");
        double x = Double.parseDouble(in[0]);
        double y = Double.parseDouble(in[1]);

        boolean result = linearAlgorithm.isBelongToRegion(x, y);
        System.out.println("That point belongs to region: " + result);

        return result;
    }

    @Override
    public double calcMilkVolume() {
        String[] in = inputFromFile.getInput("milkInput.txt")
                .split("\\s");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);

        double result = linearAlgorithm.calcMilkVolume(n, m);
        System.out.println("Milk volume in big cans is " + result);

        return result;
    }

    @Override
    public double[] calcCircle() {
        String in = inputFromFile.getInput("circleInput.txt");
        double r = Double.parseDouble(in);

        double[] result = linearAlgorithm.calcCircle(r);
        System.out.printf("Length of the circle is: %f; area is: %f%n", result[0], result[1]);

        return result;
    }
}
