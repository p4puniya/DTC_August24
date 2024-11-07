package Lecture13;

public class Implement {
    public static void main(String[] args) {
        Queue q= new Queue();
        q.enQueue(1);
        q.enQueueCircular(2);
        q.enQueue(3);
        q.enQueueCircular(4);
        q.Display();
        q.deQueue();
        q.deQueueCircular();
        q.Display();
    }
}
