package by.training.task02.service.impl;

import by.training.task02.service.ArithmProgrChecker;

public class ArithmProgrCheckerImpl implements ArithmProgrChecker {
    @Override
    public boolean hasProgression(int a) {
        int prev = a % 10;
        int value = a / 10;
        int curr = value % 10;
        int diff = curr - prev;
        value /= 10;
        while (value > 0){
            prev = curr;
            curr = value % 10;
            if (curr - prev != diff) return false;
            value /= 10;
        }
        return true;
    }
}
