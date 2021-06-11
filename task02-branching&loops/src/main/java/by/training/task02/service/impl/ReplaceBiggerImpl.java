package by.training.task02.service.impl;

import by.training.task02.service.ReplaceBigger;

public class ReplaceBiggerImpl implements ReplaceBigger {
    @Override
    public int[] calculate(int x, int y) {
        return y > x ? new int[]{y, x} : new int[]{x, y};
    }
}
