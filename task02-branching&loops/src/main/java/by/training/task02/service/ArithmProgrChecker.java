package by.training.task02.service;

/**
 * Represents solution for task 38:
 * Для заданного натурального числа определить, образуют ли его цифры арифметическую
 * прогрессию. Предполагается, что в числе не менее трёх цифр. Например: 1357, 963
 * @author Pavel Kalinin
 */
public interface ArithmProgrChecker {

    /**
     * Checks does digits of given number create arithmetic progression
     * @param a Number to check
     * @return true if digits create progression, else false
     */
    boolean hasProgression(int a);
}
