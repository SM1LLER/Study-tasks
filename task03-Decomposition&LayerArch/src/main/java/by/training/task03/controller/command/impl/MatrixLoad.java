package by.training.task03.controller.command.impl;

import by.training.task03.controller.command.Command;
import by.training.task03.entity.Matrix;
import by.training.task03.service.MatrixStorageActions;
import by.training.task03.service.RequestParser;
import by.training.task03.service.exception.ServiceException;
import by.training.task03.service.factory.ServiceFactory;
import by.training.task03.view.ArraySorterUI;
import by.training.task03.view.MatrixActionsUI;
import by.training.task03.view.factory.ViewFactory;

import java.util.List;

public class MatrixLoad implements Command {
    @Override
    public void execute(String request) throws ServiceException {
        MatrixActionsUI matrixActionsUI = ViewFactory.getInstance().getMatrixActionsUI();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        RequestParser requestParser = serviceFactory.getRequestParser();
        MatrixStorageActions matrixActions = serviceFactory.getMatrixStorageActions();

        String fileName = requestParser.getFileName(request);
        List<Matrix> matrixList = matrixActions.loadToMem(fileName);
        matrixActionsUI.printLoadMessage(matrixList);
    }
}
