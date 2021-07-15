package by.training.task04.controller.command.impl;

import by.training.task04.controller.command.Command;
import by.training.task04.service.ClientGenerateToFile;
import by.training.task04.service.ClientGenerator;
import by.training.task04.service.RequestParser;
import by.training.task04.service.exception.ServiceException;
import by.training.task04.service.factory.ServiceFactory;
import by.training.task04.view.GeneratorView;
import by.training.task04.view.factory.ViewFactory;

public class GenerateClients implements Command {
    @Override
    public void execute(String request) throws ServiceException {

        GeneratorView generatorView = ViewFactory.getInstance().getGeneratorView();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ClientGenerateToFile clientGenerator = serviceFactory.getClientGenerateToFile();
        RequestParser requestParser = serviceFactory.getRequestParser();

        String fileName = requestParser.getFileName(request);
        int numOfClients = requestParser.getNumOfClients(request);
        clientGenerator.generateToFile(fileName, numOfClients);
        //todo два сервиса работают над генерацией 1 - создаёт, другой загружает
        generatorView.printGenerated(fileName);
    }
}
