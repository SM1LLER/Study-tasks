package by.training.task02.view;

import by.training.task02.controller.BranchingTaskCalculator;
import by.training.task02.controller.BranchingTaskCalculatorImpl;
import by.training.task02.dal.FromStrToNumTrans;
import by.training.task02.dal.FromStrToNumTransImpl;

/**
 * Represents solutions for task 6, 14, 22, 30, 38 with branching statements
 * Input gets from file, output to console
 * @author Pavel Kalinin
 */
public class BranchTasksUI {
    private BranchingTaskCalculator taskCalc = new BranchingTaskCalculatorImpl();
    private FromStrToNumTrans translator = new FromStrToNumTransImpl();

    /**
     * Prints the biggest of two values.
     * @param fileName File with input values
     */
    public void whichBiggest(String fileName){
        System.out.println("Составить программу: определения наибольшего из двух чисел а и b");
        int[][] input = translator.getIntFrom(fileName);
        for(int[] in : input){
            System.out.printf("Входные данные: а = %d, b = %d%n", in[0], in[1]);
            int result = taskCalc.whichBiggest(in[0], in[1]);
            System.out.printf("Выходные данные: Наибольшее %d%n", result);
        }
    }

    /**
     * Calculates and prints function F(x). Which function to use depends on input value.
     * @param fileName File with input values
     */
    public void calcFunction(String fileName){
        System.out.println("Вычислить значение функци: F(x) = x^2, если 0 <= x <= 3; 4, если x > 3 или x < 0");
        double[][] input = translator.getDoubleFrom(fileName);
        for(double[] in : input){
            System.out.printf("Входные данные: x = %f%n", in[0]);
            double result = taskCalc.calcFunction(in[0]);
            System.out.printf("Выходные данные: f(x) = %f%n", result);
        }
    }

    /**
     * Checks does a < b < c and manipulates with input depends on result.
     * Prints result.
     * @param  fileName File with input values
     */
    public void doubleOrAbs(String fileName){
        System.out.println("Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с," +
                            " и заменить их абсолютными значениями, если это не так");
        int[][] input = translator.getIntFrom(fileName);
        for(int[] in : input){
            System.out.printf("Входные данные: a = %d, b = %d, c = %d%n", in[0], in[1], in[2]);
            int[] result = taskCalc.doubleOrAbs(in[0], in[1], in[2]);
            System.out.printf("Выходные данные:  a = %d, b = %d, c = %d%n", result[0], result[1], result[2]);
        }
    }

    /**
     * Swaps values if y bigger than x.
     * Prints result.
     * @param  fileName File with input values
     */
    public void replaceBiggest(String fileName){
        System.out.println("Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее");
        int[][] input = translator.getIntFrom(fileName);
        for(int[] in : input){
            System.out.printf("Входные данные: x = %d, y = %d%n", in[0], in[1]);
            int[] result = taskCalc.replaceBiggest(in[0], in[1]);
            System.out.printf("Выходные данные:  x = %d, y = %d%n", result[0], result[1]);
        }
    }

    /**
     * Checks does exist triangle with given angles
     * and if it does than checks is it right triangle.
     * Prints result.
     * @param  fileName File with input values
     */
    public void isTriangleExist(String fileName){
        System.out.println("Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник," +
                        " и если да, то будет ли он прямоугольным");
        double[][] input = translator.getDoubleFrom(fileName);
        for(double[] in : input){
            System.out.printf("Входные данные: first angle = %f, second angle = %f%n", in[0], in[1]);
            boolean[] result = taskCalc.isTriangleExist(in[0], in[1]);
            System.out.printf("Выходные данные: Треугольник = %b, прямоугольный = %b%n", result[0], result[1]);
        }
    }

}
