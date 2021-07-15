package by.training.task04.view.factory;

import by.training.task04.view.*;

public class ViewFactory {
    private static ViewFactory instance = new ViewFactory();
    private CommandRequester commandRequester = new CommandRequesterImpl();
    private GeneratorView generatorView = new GeneratorViewImpl();
    private ClientsView clientsView = new ClientsViewImpl();

    private ViewFactory(){}
    public static ViewFactory getInstance(){
        return instance;
    }

    public CommandRequester getCommandRequester() {
        return commandRequester;
    }

    public GeneratorView getGeneratorView() {
        return generatorView;
    }

    public ClientsView getClientsView() {
        return clientsView;
    }
}
