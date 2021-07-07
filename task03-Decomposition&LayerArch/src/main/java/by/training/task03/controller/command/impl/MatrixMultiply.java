package by.training.task03.controller.command.impl;

import by.training.task03.controller.command.Command;
import by.training.task03.entity.Matrix;
import by.training.task03.service.MatrixStorageActions;
import by.training.task03.service.exception.ServiceException;
import by.training.task03.service.factory.ServiceFactory;
import by.training.task03.view.MatrixActionsUI;
import by.training.task03.view.factory.ViewFactory;

public class MatrixMultiply implements Command {
    @Override
    public void execute(String request) throws ServiceException {
        MatrixActionsUI matrixActionsUI = ViewFactory.getInstance().getMatrixActionsUI();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        MatrixStorageActions matrixActions = serviceFactory.getMatrixStorageActions();

        Matrix result = matrixActions.multiply();
        matrixActionsUI.printResult(result);
    }
}
