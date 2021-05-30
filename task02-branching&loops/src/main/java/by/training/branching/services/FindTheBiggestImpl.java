package by.training.branching.services;

public class FindTheBiggestImpl implements FindTheBiggest {
    @Override
    public int calculate(int a, int b) {
        return b > a ? b : a;
    }
}
