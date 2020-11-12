package Queue;

public abstract class QueueADT {

    //method

    abstract void enqueue(int data);
    abstract int dequeue();


    //status
    abstract int first();
    abstract boolean isEmpty();
    abstract int size();
}
