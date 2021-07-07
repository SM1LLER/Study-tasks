package by.training.task03.view;

import by.training.task03.controller.Controller;
import by.training.task03.entity.Array;

import java.util.Locale;
import java.util.Scanner;

public class ArraySorterUIFromConsole implements ArraySorterUI {
    private String[] input = null;
    private String[] output = null;
    private ResourceManager res = ResourceManager.INSTANCE;

    public void setInput(Array[] arrays){
        this.input = arrayToStringArr(arrays);
    }

    public void setOutput(Array[] arrays){
        this.output = arrayToStringArr(arrays);
    }

    public void printResponse(){
        System.out.println(res.getString("message.sortResponse"));
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            out.append((i + 1) + ". ").append(input[i]).append(" -> ").append(output[i]).append("\n");
        }
        System.out.println(out);
    }

    private String[] arrayToStringArr(Array[] arrays){
        String[] result = new String[arrays.length];
        int i = 0;
        for (Array array : arrays){
            result[i++] = array.toString();
        }
        return result;
    }




}
