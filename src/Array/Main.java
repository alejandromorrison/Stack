package Array;

public class Main {
    public static void main(String[] args) {
        // im going to create a stack of 3 items
        Stack stack = new Stack(3);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

        System.out.println("-------");
        stack.push(5);
        stack.push(2);
        stack.push(9);
        stack.push(99);

        System.out.println("---------");

        System.out.println(stack.peek());

        stack.pop();
        stack.pop();

        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack.peek());
    }
}
