package by.training.task04.controller;

import by.training.task04.controller.command.Command;
import by.training.task04.controller.command.CommandName;
import by.training.task04.controller.command.impl.*;

import java.util.HashMap;
import java.util.Map;

final class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider(){

        repository.put(CommandName.HELP, new Help());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
        repository.put(CommandName.CHANGE_LANGUAGE, new ChangeLanguage());
        repository.put(CommandName.FULL_MONEY, new FullMoney());
        repository.put(CommandName.GENERATE_CLIENTS, new GenerateClients());
        repository.put(CommandName.LOAD_CLIENTS, new LoadClients());
        repository.put(CommandName.MONEY_DEBT, new MoneyDebt());
        repository.put(CommandName.AVAILABLE_MONEY, new AvailableMoney());
        repository.put(CommandName.GET_CLIENT, new GetClient());
    }

    Command getCommand(String name){
        CommandName commandName = null;
        Command command = null;
        try{
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e){
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
