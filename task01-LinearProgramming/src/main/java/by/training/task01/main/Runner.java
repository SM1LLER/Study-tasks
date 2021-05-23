package by.training.task01.main;

import by.training.task01.calculator.LinearAlgorithmUIFromConsole;
import by.training.task01.calculator.LinearAlgorithmUIFromFile;
import by.training.task01.interfaces.LinearAlgorithmUI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {
    static final Logger runnerLogger = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        LinearAlgorithmUI fromConsole = new LinearAlgorithmUIFromConsole();
        LinearAlgorithmUI fromFile = new LinearAlgorithmUIFromFile();

        runnerLogger.info("Start reading console");
        System.out.println("14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.");
        fromConsole.calcCircle();

        System.out.println("Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах,\n" +
                "если в каждом большом бидоне на 12 л. больше, чем в малом?");
        fromConsole.calcMilkVolume();

        System.out.println("Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.");
        fromConsole.calcResistance();

        System.out.println("22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное\n" +
                "значение длительности в часах, минутах и секундах в следующей форме:\n" +
                "ННч ММмин SSc");
        fromConsole.calcTime();

        System.out.println("38. Для области c) составить линейную программу, которая печатает true, если точка с координатами (х, у)\n" +
                "принадлежит закрашенной области, и false — в противном случае:");
        fromConsole.isBelongToRegion();

        runnerLogger.info("Start reading from file");
        System.out.println("14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.");
        fromFile.calcCircle();

        System.out.println("Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах,\n" +
                "если в каждом большом бидоне на 12 л. больше, чем в малом?");
        fromFile.calcMilkVolume();

        System.out.println("Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.");
        fromFile.calcResistance();

        System.out.println("22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное\n" +
                "значение длительности в часах, минутах и секундах в следующей форме:\n" +
                "ННч ММмин SSc");
        fromFile.calcTime();

        System.out.println("38. Для области c) составить линейную программу, которая печатает true, если точка с координатами (х, у)\n" +
                "принадлежит закрашенной области, и false — в противном случае:");
        fromFile.isBelongToRegion();
    }
}
