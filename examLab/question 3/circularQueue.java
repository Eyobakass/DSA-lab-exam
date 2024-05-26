package examLab;

public class circularQueue {
    private int[] queue;
    private int front, rear, size;

    public circularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }

    public void enqueue(int value) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
        } else if (isEmpty()) {
            front = rear = 0;
            queue[rear] = value;
        } else {
            rear = (rear + 1) % size;
            queue[rear] = value;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else if (front == rear) {
            int temp = queue[front];
            front = rear = -1;
            return temp;
        } else {
            int temp = queue[front];
            front = (front + 1) % size;
            return temp;
        }
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return queue[front];
        }
    }

    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return queue[rear];
        }
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public static void main(String[] args) {
        circularQueue q = new circularQueue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Dequeue: " + q.dequeue());
        q.enqueue(4);
        System.out.println("Front: " + q.front()); 
        System.out.println("Rear: " + q.rear());
    }
}
