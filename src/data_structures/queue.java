package data_structures;

public class queue<T> {
    private T[] queue;
    private int max;
    private int front;
    private int back;
    private int size;

    public queue(int size) {
        this.queue = (T[]) new Object[size];
        this.front = 0;
        this.back = 0;
        this.size = 0;
        this.max = size;
        System.out.println("A queue has been made with the size of " + this.max);
        return;
    }

    public boolean enqueue(T item) {

        if(this.size == this.max) {
            System.out.println("Queue is full");
            return false;
        }
        else if (this.size == 0) {
            this.queue[this.front] = item;
            this.size++;
        }
        else {
            this.back = (this.back + 1) % this.max;
            this.queue[this.back] = item;
            this.size++;
        }

        return true;
    }

    public T dequeue() {

        if(this.size == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        else {
            T item = this.queue[this.front];
            this.queue[this.front] = null;
            this.front = (this.front + 1) % this.max;
            this.size--;
            return item;
        }
    }

    public void display() {

        if(this.size == 0) {
            System.out.println("Queue is empty");
        }
        else {

            System.out.println("Queue");
            System.out.println("------");
            int f = this.front;
            for(int i = 0; i < this.size; i++) {
                System.out.println("[" + this.queue[f] + "]");
                f = (f + 1) % max;
            }
            System.out.println("");
        }
        return;
    }
}
