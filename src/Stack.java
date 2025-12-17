import java.util.LinkedList;

//Stack implementation using generics
public class Stack<T> {
    private LinkedList<T> list; //stores the elements for the stack

    //Constructor
    public Stack()
    {
        list = new LinkedList<>();
    }

    //Method to push element in the stack
    public void push(T data)
    {
        list.addFirst(data);
        System.out.println(data + " pushed to the stack successfully");
    }

    //Method to get top element of the stack
    public T peek()
    {
        if (list.isEmpty())     //stack is empty
            return null;
        return list.getFirst();
    }

    //Method to pop element for the stack
    public T pop()
    {
        if (list.isEmpty())
            return null;
        return list.removeFirst();
    }

    //Check if stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
