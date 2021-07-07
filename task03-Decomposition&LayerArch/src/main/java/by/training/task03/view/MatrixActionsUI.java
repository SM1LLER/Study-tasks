package by.training.task03.view;

import by.training.task03.entity.Matrix;

import java.util.List;


/**
 * View class that speaks with user to provide Matrix actions
 * @author Pavel Kalinin
 */
public interface MatrixActionsUI {
    /**
     * Prints result of the matrix action
     * @param matrix - Result of the action
     */
    void printResult(Matrix matrix);
    /**
     * Prints the matrices that have loaded after load action
     * @param matrixList - List of matrices have loaded in memory
     */
    void printLoadMessage(List<Matrix> matrixList);
}
