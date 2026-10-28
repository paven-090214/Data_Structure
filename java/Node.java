package linkedList;

public class Node {

    private int index;
    private int item;
    private Node next;

    public Node(int index, int item) {
        this.index = index;
        this.item = item;
        this.next = null;
    }

    public Node(int item) {
        this(1, item);
        next = null;
        //this.index = index;
        //this.item = 0;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public int getIndex() {
        return index;
    }

    public int getItem() {
        return item;
    }
}

