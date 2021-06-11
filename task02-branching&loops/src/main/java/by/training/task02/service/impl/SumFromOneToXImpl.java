package by.training.task02.service.impl;

import by.training.task02.service.SumFromOneToX;

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
