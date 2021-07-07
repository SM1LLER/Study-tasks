package by.training.task03.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortedLinkedList {
    private static final Logger logger = LogManager.getLogger();
    private Node head = null;
    private Node tail = null;
    private boolean empty = true;
    private boolean isNull = false;

    public SortedLinkedList(){}

    public SortedLinkedList(int data){
        Node newNode = new Node(data);
        this.tail = newNode;
        this.head = newNode;
        this.empty = false;
    }

    public void add(int data){
        logger.debug(String.format("Trying to add: %d", data));
        this.empty = false;
        Node newNode = new Node(data);
        if (this.head == null){
            logger.debug(String.format("First element adding: %d", newNode.getData()));
            this.head = newNode;
            this.tail = newNode;
        } else if (this.head.getData() > data) {
            newNode.setNextNode(head);
            this.head.setPrevNode(newNode);
            this.head = newNode;
        } else {
            Node curr = this.head;
            while (curr.getNextNode() != null
                    && curr.getNextNode().getData() < data) {
                curr = curr.getNextNode();
                logger.debug(String.format("Finding place to paste cycle: %n" +
                                "list: %s curr.getNextNode = %b, curr.data = %d"
                        , toString(), curr.getNextNode() == null, curr.getData())
                );
            }

            if (curr.getNextNode() == null) {
                tail = newNode;
                logger.debug(String.format("New tail = %d"
                        , tail.getData()));
            }

            newNode.setNextNode(curr.getNextNode());
            if(curr.getNextNode() != null)
                curr.getNextNode().setPrevNode(newNode);
            curr.setNextNode(newNode);
            newNode.setPrevNode(curr);
            logger.debug(String.format("Added new element: %d, after: %d"
                    , newNode.getData(), curr.getData())
            );
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public boolean isEmpty() {
        return empty;
    }

    @Override
    public String toString() {
        String list = "head = " + head.getData() + " tail = " + tail.getData() + "{";
        StringBuilder sortedList = new StringBuilder();
        sortedList.append("head = ")
                .append(head.getData())
                .append(" tail = ")
                .append(tail.getData())
                .append(" {");
        Node curr = head;
        int j = 0;
        while (curr.getNextNode() != null && j != 10){
            sortedList.append(curr.getData()).append(", ");
            curr = curr.getNextNode();
            j++;
        }

        return sortedList.toString();
    }
}

