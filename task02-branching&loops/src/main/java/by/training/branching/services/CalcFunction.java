package by.training.branching.services;

/**
 * Represents solution for task 38:
 * Вычислить значение функци: F(x) =
 * x^2, если 0 <= x <= 3
 * 4, если x > 3 или x < 0
 * @author Pavel Kalinin
 */
public interface CalcFunction {

    /**
     * Calculates function F(x). Which function to use depends on input value.
     * @param x
     * @return If 0 <= x <= 3, than returns x^2, else returns 4
     */
    double calculate(double x);
}
