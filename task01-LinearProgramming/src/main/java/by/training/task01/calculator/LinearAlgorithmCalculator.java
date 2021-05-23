package by.training.task01.calculator;

import by.training.task01.interfaces.LinearAlgorithm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Implementation of LinearAlgorithm with linear solutions of tasks
 * @author Pavel Kalinin
 */
public class LinearAlgorithmCalculator implements LinearAlgorithm {

   static final Logger userLogger = LogManager.getLogger(LinearAlgorithmCalculator.class);

    @Override
    public String calcTime(int sec) {
        int hours = sec / 3600;
        int mins = (sec / 60) % 60;
        int secs = sec % 60;
        String result = String.format("%02dч %02dмин %02dс.",hours,mins,secs);

        userLogger.debug(String.format("calcTime() in: %d out: %s", sec, result));
        return result;
    }

    @Override
    public double calcResistance(double r1, double r2, double r3) {
        double result =  1 / r1 + 1 / r2 + 1 / r3;
        userLogger.debug(String.format("calcResistance() in: %f %f %f out: %f", r1, r2, r3, result));
        return result;
    }

    @Override
    public boolean isBelongToRegion(double x, double y) {

        boolean isBelong = false;
        if (x >= 0
                && (x * x + y * y <= 16
                || (y <= 0 && (x * x + y * y <= 25)))
        ){
            isBelong = true;
        }

        userLogger.debug(String.format("isBelongToRegion() in: %f %f out: %s", x, y, isBelong));
        return isBelong;
    }

    @Override
    public double calcMilkVolume(int n, int m) {
        double result = (80.0 / n + 12) * m;
        userLogger.debug(String.format("calcMilkVolume() in: %d %d out: %f", m, n, result));
        return result;
    }

    @Override
    public double[] calcCircle(double r) {
        double[] result = new double[2];
        result[0] = 2 * 3.14 * r;
        result[1] = 3.14 * r * r;
        userLogger.debug(String.format("calcMilkVolume() in: %f out: %f %f", r, result[0], result[1]));
        return result;
    }
}
