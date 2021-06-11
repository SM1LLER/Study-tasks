package by.training.task02.service.impl;

import by.training.task02.service.FindTheBiggest;

public class FindTheBiggestImpl implements FindTheBiggest {
    @Override
    public int calculate(int a, int b) {
        return b > a ? b : a;
    }
}
