package Queue;

public class QueueArrayImpl extends QueueADT {

    int[] capacity;
    int size;

    public QueueArrayImpl(int size){
        this.capacity = new int[size];
        this.size = 0 ;
    }



    @Override
    void enqueue(int data) {
        // check if full
        if(this.size() == this.capacity.length){

           int newSize = this.capacity.length *2;

           int[] newCapacity = new int[newSize];
           //Copy data from capacity to newCapacity
            for (int i = 0; i<newSize/2 ;i++){
                newCapacity[i + 1] = this.capacity[i];
            }
            newCapacity[0] = data;
            this.capacity = newCapacity;
        }

        else {
            for(int i=this.size - 1 ; i > 0;i--){
                this.capacity[i] = this.capacity[i-1];
            }
            this.capacity[0] = data;
            this.size ++;
        }
    }

    @Override
    int dequeue() {
        return 0;
    }

    @Override
    int first() {
        return this.capacity[0];
    }

    @Override
    boolean isEmpty() {
        return this.size() ==0;
    }

    @Override
    int size() {
        return this.size;
    }
}
