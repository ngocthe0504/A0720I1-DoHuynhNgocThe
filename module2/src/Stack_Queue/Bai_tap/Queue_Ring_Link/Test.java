package Stack_Queue.Bai_tap.Queue_Ring_Link;

import Stack_Queue.Thuc_hanh.Queue.MyLinkedListQueue;

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Dequeue();
        queue.Dequeue();
        queue.Enqueue(30);
        queue.Enqueue(40);
        queue.Enqueue(50);
        System.out.println("Dequeued item is " + queue.Dequeue().data);
    }
}
