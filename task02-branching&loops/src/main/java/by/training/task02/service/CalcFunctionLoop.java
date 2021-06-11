package by.training.task02.service;

/**
 * Represents solution for task 22:
 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
 * представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
 * значения функции: F(x) = sin(x)^2
 * @author Pavel Kalinin
 */
public interface CalcFunctionLoop {

    /**
     * Calculate function F(x), where x belongs [a,b] and increases at h
     * @param a start bound
     * @param b end bound
     * @param h step of the growing
     * @return Array of the string where each element represents one line of the table
     */
    String[] calculate(double a, double b, double h);
}
