package Queue;
import java.util.Queue;
import java.util.LinkedList;

public class Queue_by_KK {
    public static void main(String[] args) {
    Queue queue = new LinkedList(); //here LinkedList is used as a Queue

    queue.add(3);
    queue.add(8);
    queue.add(4);
    queue.add(9);
    queue.add(10);

        System.out.println("the queue is:" + queue);

        queue.poll();
        queue.poll();
        System.out.println(" after the poll the updated queue is:"+queue);

        System.out.println(queue.peek());

        queue.element();
        System.out.println("After the elements queue is used:"+queue);

        System.out.println("After use of the remove:"+queue.remove());
        System.out.println("Now the updated queue is:" + queue);
    }
}
