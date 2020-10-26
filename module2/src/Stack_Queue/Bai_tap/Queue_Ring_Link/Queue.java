package Stack_Queue.Bai_tap.Queue_Ring_Link;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public void Enqueue(int data) {
        Node temp = new Node(data);
        if (this.rear == null) {
            this.rear = this.front = temp;
        }
        this.rear.link = temp;
        this.rear = temp;
        this.rear.link = this.front;
    }
    public Node Dequeue() {
        if (this.front == null) {
            return null;
        }
        this.rear.link = this.front.link;
        this.front = this.front.link;
        return this.front;
    }
}
