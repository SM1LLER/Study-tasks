package by.training.task02.view;

import by.training.task02.controller.LoopTasksCalculator;
import by.training.task02.controller.LoopTasksCalculatorImpl;
import by.training.task02.dal.FromStrToNumTrans;
import by.training.task02.dal.FromStrToNumTransImpl;
import by.training.task02.dal.InputFromFile;
import by.training.task02.dal.InputFromFileImpl;

import java.util.Arrays;
import java.util.List;

/**
 * Represents solutions for task 6, 14, 22, 30, 38 with loop statements
 * Input gets from file, output to console
 * @author Pavel Kalinin
 */
public class LoopTasksUI {

    private LoopTasksCalculator taskCalc = new LoopTasksCalculatorImpl();
    private FromStrToNumTrans translator = new FromStrToNumTransImpl();

    /**
     * Calculates Sn of the row 1 + 1/2 + 1/3 + 1/4 + ... + 1/n and prints it
     * @param  fileName File with input values
     */
    public void calcArithmProgres(String fileName){
        System.out.println("Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n");
        int[][] input = translator.getIntFrom(fileName);
        for(int[] in : input){
            System.out.printf("Входные данные: n = %d%n", in[0]);
            double result = taskCalc.calcArithmProgres(in[0]);
            System.out.printf("Выходные данные: S(n) = %f%n", result);
        }
    }

    /**
     * Checks does digits of given number create arithmetic progression
     * Prints true or false
     * @param  fileName File with input values
     */
    public void hasProgression(String fileName){
        System.out.println("Для заданного натурального числа определить, образуют ли его цифры арифметическую" +
                " прогрессию. Предполагается, что в числе не менее трёх цифр. Например: 1357, 963");
        int[][] input = translator.getIntFrom(fileName);
        for(int[] in : input){
            System.out.printf("Входные данные: a = %d%n", in[0]);
            boolean result = taskCalc.hasProgression(in[0]);
            System.out.printf("Выходные данные: Есть прогрессия = %b%n", result);
        }
    }

    /**
     * Calculate function F(x), where x belongs [a,b] and increases at h
     * Prints result as a table
     * @param  fileName File with input values
     */
    public void calcFunction(String fileName){
        System.out.println("Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат" +
                " представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие" +
                " значения функции: F(x) = sin(x)^2");
        double[][] input = translator.getDoubleFrom(fileName);
        for(double[] in : input){
            System.out.printf("Входные данные: a = %f b = %f h = %f%n", in[0], in[1], in[2]);
            String[] result = taskCalc.calcFunction(in[0], in[1], in[2]);
            System.out.println("Выходные данные: ");
            Arrays.stream(result).forEach(System.out::println);
        }
    }


    /**
     * Translates given string from roman to arabic number and print result
     * @param  fileName File with input values
     */
    public void translateFromRoman(String fileName){
        System.out.println("Написать программу, переводящую римские цифры в арабские.");
        InputFromFile inputFromFile = new InputFromFileImpl();
        List<String> input = inputFromFile.getInput(fileName);
        for(String in : input){
            System.out.println("Входные данные: Римская цифра = "+in);
            int result = taskCalc.translateFromRoman(in);
            System.out.println("Выходные данные: Арабская цифра = "+result);
        }
    }

    /**
     * Sums digits from 1 to given number and prints result.
     * @param  fileName File with input values
     */
    public void calcSumToX(String fileName){
        System.out.println("Напишите программу, где пользователь вводит любое целое положительное число. А программа" +
                " суммирует все числа от 1 до введенного пользователем числа.");
        int[][] input = translator.getIntFrom(fileName);
        for(int[] in : input){
            System.out.printf("Входные данные: x = %d%n", in[0]);
            int result = taskCalc.calcSumToX(in[0]);
            System.out.printf("Выходные данные: Сумма = %d%n", result);
        }
    }

}
