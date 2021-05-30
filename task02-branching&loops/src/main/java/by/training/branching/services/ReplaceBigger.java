package by.training.branching.services;

/**
 * Represents solution for task 22:
 * Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее
 * @author Pavel Kalinin
 */
public interface ReplaceBigger {

    /**
     * Swaps values if y bigger than x
     * @param x
     * @param y
     * @return Array of integer where indexes [0], [1] are [x], [y]
     */
    int[] calculate(int x, int y);
}
