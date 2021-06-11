package by.training.task02.controller;

import by.training.task02.view.BranchTasksUI;
import by.training.task02.view.LoopTasksUI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {
    static final Logger runnerLogger = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        BranchTasksUI branchTasks = new BranchTasksUI();
        LoopTasksUI loopTasks = new LoopTasksUI();

        runnerLogger.info("Start branch tasks");
        branchTasks.whichBiggest("branch6.txt");
        branchTasks.calcFunction("branch38.txt");
        branchTasks.doubleOrAbs("branch30.txt");
        branchTasks.isTriangleExist("branch14.txt");
        branchTasks.replaceBiggest("branch22.txt");
        runnerLogger.info("Start loop tasks");
        loopTasks.calcArithmProgres("loop14.txt");
        loopTasks.calcSumToX("loop6.txt");
        loopTasks.hasProgression("loop38.txt");
        loopTasks.translateFromRoman("loop30.txt");
        loopTasks.calcFunction("loop22.txt");
    }
}
