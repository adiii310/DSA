package Queue;

public class QueueUsingArrays {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        // queue.dequeue();
        queue.enqueue(40);

        System.out.println(queue.front());
        System.out.println(queue.rear());
        System.out.println(queue.size());
        queue.display();

    }
}

class Queue {
    int front, rear, size;
    int capacity;
    int[] array;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.front = this.size = 0;
        this.rear = -1;
        this.array = new int[this.capacity];
    }

    boolean isfull(Queue queue) {
        return this.size == this.capacity;
    }

    boolean isEmpty(Queue queue) {
        return this.size == 0;
    }

    public void enqueue(int data) {
        if (isfull(this)) {
            System.out.println("/n Queue is full ");
        } else {
            this.rear = (this.rear + 1) % this.capacity;
            this.array[this.rear] = data;
            this.size = this.size + 1;
            System.out.println(data + "data added sucessfully /n");
        }
    }

    public void dequeue() {
        if (isEmpty(this))
            return;
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
    }

    int front() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        return this.array[this.front];
    }

    int rear() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        return this.array[this.rear];
    }

    int size() {
        return this.size;
    }

    void display() {
        for (int i = this.front; i <= this.size; i++) {
            System.out.println(this.array[i]);
        }
    }

}