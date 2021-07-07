package by.training.task03.controller;

import by.training.task03.view.ArraySorterUI;
import by.training.task03.view.CommandRequester;
import by.training.task03.view.factory.ViewFactory;

public class Runner {
    public static void main(String[] args) {
        CommandRequester ui = ViewFactory.getInstance().getCommandRequester();
        while (true){
            ui.requestInput();
        }
    }
}
