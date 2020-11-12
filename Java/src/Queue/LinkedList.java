package Queue;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public void addLast(Node node) {
        if (this.head == null) {
            this.head = node;
        }
        else {
            this.tail.next = node;
        }
        this.tail = node;
        this.size ++;
    }

    public void addFirst(Node node) {
        if (isEmpty()) {
            this.tail = node;
        }
        node.next = this.head;
        this.head = node;
        this.size ++;
    }

    public int removeFirst() {
        if (this.head == null) {
            throw new NullPointerException("The list is empty");
        }

        if (this.head.next == null) {
            this.tail = null;
        }

        int data = this.head.data;
        this.head = this.head.next;

        this.size --;
        return data;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int first() {
        if (this.head == null) {
            throw new NullPointerException("The list is empty");
        }
        return this.head.data;
    }

    public int last() {
        return this.tail.data;
    }

    public int size() {
        return this.size;
    }
}
