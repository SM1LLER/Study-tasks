package by.training.task03.entity;

public class Node {
    private int data;
    private Node nextNode = null;
    private Node prevNode = null;
    public Node(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setPrevNode(Node prevNode){
        this.prevNode = prevNode;
    }

    public Node getPrevNode() {
        return prevNode;
    }
}

