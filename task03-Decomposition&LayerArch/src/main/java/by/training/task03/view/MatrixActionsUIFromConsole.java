package by.training.task03.view;

import by.training.task03.entity.Matrix;

import java.util.List;

public class MatrixActionsUIFromConsole implements MatrixActionsUI{
    private ResourceManager res = ResourceManager.INSTANCE;

    @Override
    public void printResult(Matrix matrix) {
        String response = String.format(res.getString("message.matrixResult") +"%n" + matrix.toString()) ;
        System.out.println(response);
    }

    @Override
    public void printLoadMessage(List<Matrix> matrices){
        System.out.println(res.getString("message.matrixLoad"));
        for(Matrix mtx : matrices){
            System.out.println(mtx);
        }
    }
}
