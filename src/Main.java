//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the program for stack and queue");

        System.out.println();
        System.out.println("Stack:");
        Stack<Integer> stack = new Stack<>();

        stack.push(4);
        int top = stack.peek();
        System.out.println("Top of the stack is " + top);
        stack.push(5);
        top = stack.peek();
        System.out.println("Top of the stack is " + top);
        while (!stack.isEmpty()) {
            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
        }

        System.out.println();
        System.out.println("Queue:");
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(6);

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
}