package by.training.loop.services;

/**
 * Represents solution for task 30:
 * Написать программу, переводящую римские цифры в арабские.
 * @author Pavel Kalinin
 */
public interface RomanToArab {

    /**
     * Translates given string from roman to arabic number
     * @param roman Roman number
     * @return int result of translation to arabic number
     */
    int translate(String roman);
}
