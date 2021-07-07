package by.training.task03.controller;

import by.training.task03.controller.command.Command;
import by.training.task03.controller.command.CommandName;
import by.training.task03.controller.command.impl.*;

import java.util.HashMap;
import java.util.Map;

final class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider(){
        repository.put(CommandName.BUBBLE_SORT, new BubbleSort());
        repository.put(CommandName.HASH_SORT, new HashSort());
        repository.put(CommandName.INSERTION_SORT, new InsertionSort());
        repository.put(CommandName.MERGE_SORT, new MergeSort());
        repository.put(CommandName.SELECTION_SORT, new SelectionSort());
        repository.put(CommandName.SHAKER_SORT, new ShakerSort());
        repository.put(CommandName.SHELL_SORT, new ShellSort());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
        repository.put(CommandName.CHANGE_LANGUAGE, new ChangeLanguage());
        repository.put(CommandName.MATRIX_LOAD, new MatrixLoad());
        repository.put(CommandName.MATRIX_MULTIPLY, new MatrixMultiply());
        repository.put(CommandName.MATRIX_SUM, new MatrixSum());
        repository.put(CommandName.MATRIX_SUBTRACT, new MatrixSubtract());
        repository.put(CommandName.HELP, new Help());
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
