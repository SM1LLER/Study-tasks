package by.training.task01.implementation;

import by.training.task01.interfaces.LinearAlgorithms;

public class LinearAlgorithmsCalculator implements LinearAlgorithms {

    @Override
    public String calcTime(int sec) {
        int hours = sec / 3600;
        int mins = (sec / 60) % 60;
        int secs = sec % 60;

        String result = "";
        if (hours < 10) result = "0";
        result += hours + "ч ";

        if (mins < 10) result += "0";
        result += mins + "мин ";

        if (secs < 10) result += "0";
        result += secs + "с.";

        return result;
    }

    @Override
    public double calcResistance(double r1, double r2, double r3) {
        double fullRes = 1 / r1 + 1 / r2 + 1 / r3;
        return fullRes;
    }

    @Override
    public boolean isBelongToRegion(double x, double y) {

        boolean isBelong = false;
        if (x >= 0
                && (x*x + y*y <= 16
                || (y <= 0 && (x*x + y*y <= 25)))
        ){
            isBelong = true;
        }

        return isBelong;
    }

    @Override
    public double calcMilkVolume(int n, int m) {
        double volume = (80 / n + 12) * m;
        return volume;
    }

    @Override
    public double[] calcCircle(double r) {
        double[] result = new double[2];
        result[0] = 2 * 3.14 * r;
        result[1] = 3.14 * r * r;
        return result;
    }
}
