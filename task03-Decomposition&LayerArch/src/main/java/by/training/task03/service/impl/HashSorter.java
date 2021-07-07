package by.training.task03.service.impl;

import by.training.task03.entity.Array;
import by.training.task03.entity.Node;
import by.training.task03.entity.SortedLinkedList;
import by.training.task03.service.MinMaxFinder;
import by.training.task03.service.Sorter;
import by.training.task03.service.exception.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HashSorter implements Sorter {
    private static final Logger logger = LogManager.getLogger();

    private final int SIZE_OF_TABLE = 10;

    @Override
    public void sort(Array array, boolean isIncreasing) {
        int length = array.getLength();
        if (length == 1){
            return;
        }

        SortedLinkedList[] linkedLists = createHashTable(array);
        if(isIncreasing){
            increasingRead(array, linkedLists);
        } else {
            decreasingRead(array, linkedLists);
        }
    }

    private int hashFunction(int val,int max){

        return (int) (val * 1.0 / max) * (SIZE_OF_TABLE - 1);
    }

    private void increasingRead(Array array, SortedLinkedList[] linkedLists){
        int length = array.getLength();
        Node currNode = null;

        for (int i = 0, j = 0; i < length; i++) {
            logger.debug(String.format("Before statement values:%n" +
                            "length = %d, i = %d, j = %d"
                    , length, i, j)
            );

            while (j < linkedLists.length - 1 && linkedLists[j] == null){
                j++;
                logger.debug(String.format("j increaser cycle:%n j = %d", j));
            }

            if (currNode == null && linkedLists[j] != null) {
                currNode = linkedLists[j].getHead();
            } else {
                currNode = currNode.getNextNode();
            }
            array.setValue(currNode.getData(), i);
            if(currNode.getNextNode() == null){
                currNode = null;
                j++;
            }
        }
    }

    private void decreasingRead(Array array, SortedLinkedList[] linkedLists){
        int length = array.getLength();

        Node currNode = null;

        for (int i = 0, j = linkedLists.length - 1; i < length; i++) {
            logger.debug(String.format("Before statement values:%n" +
                            "length = %d, i = %d, j = %d"
                    , length, i, j)
            );

            while (j > 0 && linkedLists[j] == null){
                j--;
                logger.debug(String.format("j increaser cycle:%n j = %d", j));
            }

            if (currNode == null) {
                currNode = linkedLists[j].getTail();
            } else {
                currNode = currNode.getPrevNode();
            }
            logger.debug(String.format("i = %d, element = %d", i, currNode.getData()));
            array.setValue(currNode.getData(), i);
            if(currNode.getPrevNode() == null){
                currNode = null;
                j --;
            }
        }
    }


    private SortedLinkedList[] createHashTable(Array array){
        SortedLinkedList[] hashTable = new SortedLinkedList[SIZE_OF_TABLE];
        int max = MinMaxFinder.findMax(array);
        for (int i = 0; i < array.getLength(); i++){
            int currVal = array.getValue(i);
            int address = hashFunction(currVal, max);
            logger.debug(String.format("Creating hashTable:%n" +
                    "currVal = %d, length = %d, i = %d, max = %d, address = %d", currVal, array.getLength(), i, max, address)
            );
            if (hashTable[address] == null){
                hashTable[address] = new SortedLinkedList();
            }
            hashTable[address].add(currVal);
        }
        return hashTable;
    }

}

