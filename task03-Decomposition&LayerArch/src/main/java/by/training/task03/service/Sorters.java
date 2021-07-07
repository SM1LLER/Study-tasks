package by.training.task03.service;

import by.training.task03.service.impl.*;

public enum Sorters {
    BUBBLE_SORT(new BubbleSorter()), HASH_SORT(new HashSorter()), INSERTION_SORT(new InsertionSorter()),
    SELECTION_SORT(new SelectionSorter()), SHAKER_SORT(new ShakerSorter()), SHELL_SORT(new ShellSorter()),
    MERGE_SORT(new MergeSorter());
    private Sorter sorter;
    Sorters(Sorter sorter){
        this.sorter = sorter;
    }

    public Sorter getSorter() {
        return sorter;
    }
}
