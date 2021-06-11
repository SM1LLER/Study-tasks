package by.training.task02.dal;

import java.util.Arrays;
import java.util.List;

public class FromStrToNumTransImpl implements  FromStrToNumTrans{
    InputFromFile inputFromFile = new InputFromFileImpl();

    @Override
    public double[][] getDoubleFrom(String fileName){
        List<String> input = inputFromFile.getInput(fileName);
        double[][] numbers = new double[input.size()][];
        int i = 0;
        for (String str: input) {
            numbers[i] = Arrays.stream(str.split("\\s"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            i++;
        }
        return numbers;
    }

    @Override
    public int[][] getIntFrom(String fileName){
        List<String> input = inputFromFile.getInput(fileName);
        int[][] numbers = new int[input.size()][];
        int i = 0;
        for (String str: input) {
            numbers[i] = Arrays.stream(str.split("\\s"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            i++;
        }
        return numbers;
    }
}
