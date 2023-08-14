package stack_LL;

public class Stack_using_LL_frombK {

    private Node head = null;
    private int size = 0;
    private static class Node {
        private int value;
        private Node next;
        public Node(int v, Node n) {
            value = v;
            next = n;
        }
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int peek() throws IllegalStateException {
        if (isEmpty()) {
           // throw new IllegalStateException("StackEmptyException");
            System.out.println("the stack is Empty");
        }
        return head.value;
    }
    public void push(int value) {
        head = new Node(value, head);
        size++;
    }
    public int pop() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("StackEmptyException");
        }
        int value = head.value;
        head = head.next;
        size--;
        return value;
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

}
