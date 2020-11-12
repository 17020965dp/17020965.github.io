package LinkedList;

public abstract class QueueADT {

    //method

    abstract void enqueue(int data);
    abstract void dequeue(int data);


    //status
    abstract int firs();
    abstract boolean isEmpty();
    abstract int size();
}
