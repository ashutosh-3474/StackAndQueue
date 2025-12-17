//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the program for stack and queue");

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
    }
}