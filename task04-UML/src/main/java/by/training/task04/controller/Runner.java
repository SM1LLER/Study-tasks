package by.training.task04.controller;

import by.training.task04.view.CommandRequester;
import by.training.task04.view.factory.ViewFactory;

/**
 * 4.	Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов и т.д. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 * имеющим положительный и отрицательный балансы отдельно.
 */
public class Runner {
    public static void main(String[] args) {
        CommandRequester ui = ViewFactory.getInstance().getCommandRequester();
        while (true){
            ui.requestInput();
        }
    }
}
