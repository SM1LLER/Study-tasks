package by.training.task03.view.factory;

import by.training.task03.view.*;

public class ViewFactory {
    private static ViewFactory instance = new ViewFactory();
    private ArraySorterUI arraySorterUI = new ArraySorterUIFromConsole();
    private CommandRequester commandRequester = new CommandRequesterImpl();
    private MatrixActionsUI matrixActionsUI = new MatrixActionsUIFromConsole();

    private ViewFactory(){}
    public static ViewFactory getInstance(){
        return instance;
    }

    public CommandRequester getCommandRequester() {
        return commandRequester;
    }

    public ArraySorterUI getArraySorterUI() {
        return arraySorterUI;
    }

    public MatrixActionsUI getMatrixActionsUI() {
        return matrixActionsUI;
    }
}
