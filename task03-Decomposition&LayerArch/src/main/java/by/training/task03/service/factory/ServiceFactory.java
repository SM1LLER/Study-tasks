package by.training.task03.service.factory;

import by.training.task03.service.*;
import by.training.task03.service.impl.*;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final Sorter bubble = new BubbleSorter();
    private final Sorter hash = new HashSorter();
    private final Sorter insertion = new InsertionSorter();
    private final Sorter merge = new MergeSorter();
    private final Sorter selection = new SelectionSorter();
    private final Sorter shaker = new ShakerSorter();
    private final Sorter shell = new ShellSorter();
    private final ArrayFromFileSort fromFileSort = new ArrayFromFileSortImpl();
    private final RequestParser requestParser = new RequestParserImpl();
    private final MatrixSummator matrixSummator = new MatrixSummatorImpl();
    private final MatrixSubtractor matrixSubtractor = new MatrixSubtractorImpl();
    private final MatrixMultiplicator matrixMultiplicator = new MatrixMultiplicatorImpl();
    private final MatrixStorageActions matrixStorageActions = new MatrixStorageActionsImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance() {
        return instance;
    }

    public Sorter getBubble() {
        return bubble;
    }

    public Sorter getHash() {
        return hash;
    }

    public Sorter getInsertion() {
        return insertion;
    }

    public Sorter getMerge() {
        return merge;
    }

    public Sorter getSelection() {
        return selection;
    }

    public Sorter getShaker() {
        return shaker;
    }

    public Sorter getShell() {
        return shell;
    }

    public ArrayFromFileSort getFromFileSort() {
        return fromFileSort;
    }

    public RequestParser getRequestParser() {
        return requestParser;
    }

    public MatrixSummator getMatrixSummator() {
        return matrixSummator;
    }

    public MatrixSubtractor getMatrixSubtractor() {
        return matrixSubtractor;
    }

    public MatrixMultiplicator getMatrixMultiplicator() {
        return matrixMultiplicator;
    }

    public MatrixStorageActions getMatrixStorageActions() {
        return matrixStorageActions;
    }
}
