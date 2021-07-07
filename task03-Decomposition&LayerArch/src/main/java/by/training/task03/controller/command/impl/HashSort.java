package by.training.task03.controller.command.impl;

import by.training.task03.controller.command.Command;
import by.training.task03.entity.Array;
import by.training.task03.service.ArrayFromFileSort;
import by.training.task03.service.RequestParser;
import by.training.task03.service.Sorters;
import by.training.task03.service.exception.ServiceException;
import by.training.task03.service.factory.ServiceFactory;
import by.training.task03.view.ArraySorterUI;
import by.training.task03.view.factory.ViewFactory;

public class HashSort implements Command {
    @Override
    public void execute(String request) throws ServiceException {

        ArraySorterUI arraySorterUI = ViewFactory.getInstance().getArraySorterUI();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        RequestParser requestParser = serviceFactory.getRequestParser();
        ArrayFromFileSort fromFileSort = serviceFactory.getFromFileSort();

        String fileName = requestParser.getFileName(request);
        boolean isIncreasing = requestParser.getIsIncreasing(request);
        Array[] output = fromFileSort.sort(Sorters.HASH_SORT, fileName, isIncreasing);
        Array[] input = fromFileSort.getBeforeSort();

        arraySorterUI.setInput(input);
        arraySorterUI.setOutput(output);
        arraySorterUI.printResponse();
    }
}
