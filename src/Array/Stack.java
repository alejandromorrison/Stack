package Array;

// Nelson A. Morrison H.

public class Stack {
    private final int[] StackItems;
    public int top;
    public final int size;

    public Stack(int size) {
        this.StackItems = new int[size];
        this.top = -1;
        this.size = size;
    }

    // isFull and isEmpty method
    public boolean isEmpty() {
        return top == -1;
    }

    // going to check is the Stack is full
    public boolean isFull() {
        return top == size-1;
    }

    // we are gonna be working on
    // push, pop, and peek
    public void push(int element) {
        if (!isFull()) {
            top++;
            StackItems[top] = element;
            System.out.println("The element: " + element + " has been inserted on position: " + top);
        } else System.out.println("The Stack is full");
    }

    public void pop() {
        if (isEmpty())  System.out.println("Is empty");
        else top--;
    }

    // implementing the peek method
    public int peek() {
        if (!isEmpty())
            return StackItems[top];
        else return -1;
    }
}
