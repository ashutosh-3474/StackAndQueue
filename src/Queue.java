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
}
