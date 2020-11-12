package Queue;

import static org.junit.jupiter.api.Assertions.*;

class QueueArrayImplTest {
    QueueADT queue;
    final int size = 8;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("Setup");
        queue = new QueueArrayImpl(size);
    }

    @org.junit.jupiter.api.Test
    void enqueue() {
        System.out.println("Testing enqueue");
    }

    @org.junit.jupiter.api.Test
    void dequeue() {
        System.out.println("Testing dequeue");
    }

//    @org.junit.jupiter.api.Test
//    void firstIfQueueEmpty() {
//        System.out.println("Testing first");
//        assertThrows(NullPointerException.class, () -> queue.first());
//    }

    @org.junit.jupiter.api.Test
    void firstIfQueueHasOneElement() {
        queue.enqueue(10);
        assertEquals(10, queue.first());
    }

    @org.junit.jupiter.api.Test
    void firstIfQueueFull() {
        for (int i = 0; i < size; i++) {
            queue.enqueue(i);
        }
        assertEquals (7, queue.first());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        System.out.println("Testing isEmpty");
    }

    @org.junit.jupiter.api.Test
    void size() {
        System.out.println("Testing size");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }
}