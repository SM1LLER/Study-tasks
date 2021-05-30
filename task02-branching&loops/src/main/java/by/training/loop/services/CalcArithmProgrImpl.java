package by.training.loop.services;

public class CalcArithmProgrImpl implements CalcArithmProgr{
    @Override
    public double calc(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}
