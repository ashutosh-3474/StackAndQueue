import java.util.LinkedList;

//Queue implementation using generics
public class Queue<T> {
    private LinkedList<T> list;

    //Constructor
    public Queue()
    {
        list = new LinkedList<>();
    }

    //Method to enqueue element to queue
    public void enqueue(T data)
    {
        list.addLast(data);
        System.out.println("Data added successfully");
    }

    //Method dequeue element from queue
    public T dequeue() {
        if (list.isEmpty())
            return null;
        return list.removeFirst();
    }

    //Check if queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
