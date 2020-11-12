package Queue;

public class QueueLinkedListImpl extends QueueADT{

    private LinkedList capacity;

    public QueueLinkedListImpl() {
        capacity = new LinkedList();
    }

    @Override
    void enqueue(int data) {
        capacity.addLast(new Node(data));
    }

    @Override
    int dequeue() {
        return capacity.removeFirst();
    }

    @Override
    int first() {
        return capacity.first();
    }

    @Override
    boolean isEmpty() {
        return capacity.isEmpty();
    }

    @Override
    int size() {
        return capacity.size();
    }
}
