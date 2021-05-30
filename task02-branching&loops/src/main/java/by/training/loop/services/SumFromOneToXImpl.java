package by.training.loop.services;

public class SumFromOneToXImpl implements SumFromOneToX {
    @Override
    public int sum(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++){
            sum += i;
        }
        return sum;
    }
}
