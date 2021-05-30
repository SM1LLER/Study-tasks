package by.training.branching.services;

public class TriangleExistsWithAnglesCheckerImpl implements TriangleExistsWithAnglesChecker{
    @Override
    public boolean[] isExists(double a, double b) {
        boolean[] result = new boolean[2];
        if (a+b < 180.0 && a != 0 && b !=0){
            result[0] = true;
            if (a == 90.0 || b == 90.0 || a + b == 90.0){
                result[1] = true;
            }
        }
        return result;
    }
}
