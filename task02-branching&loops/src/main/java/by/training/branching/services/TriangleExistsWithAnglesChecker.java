package by.training.branching.services;

/**
 * Represents solution for task 14:
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он
 * прямоугольным.
 * @author Pavel Kalinin
 */
public interface TriangleExistsWithAnglesChecker {

    /**
     * Checks does exist triangle with given angles
     * and if it does than checks is it right triangle
     * @param a first angle
     * @param b second angle
     * @return Array of boolean where [0],[1] are [isTriangle][isRight]
     */
    boolean[] isExists(double a, double b);
}
