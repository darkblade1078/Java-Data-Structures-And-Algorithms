package data_structures;

public class stack<T> {
    private T[] stack;
    private int size;
    private int top;

    public stack(int size) {
        this.size = 0;
        this.top = -1;
        this.stack = (T[]) new Object[size];
        System.out.println("A stack has been made with the size of " + size);
        return;
    }

    public void push(T item) {

        if (this.size == this.stack.length) {
            System.out.println("Stack is full");
            return;
        } else {
            top++;
            this.stack[this.top] = item;
            this.size++;
        }
    }

    public T pop() {

        if (this.size == 0) {
            System.out.println("Stack is empty");
            return null;
        } else {
            T item = this.stack[this.top];
            this.stack[this.top] = null;
            this.top--;
            this.size--;
            return item;
        }
    }

    public void display() {
        if (this.size == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack");
            System.out.println("------");

            for (int i = top; i >= 0; i--) {
                System.out.println("[" + this.stack[i] + "]");
            }
            System.out.println("");
        }
        return;
    }
}
