package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    Deque<Integer> deque = new ArrayDeque<>();//--> much faster than the  LinkedList
    // class and stack because here insertion and deletion both happen with both the end.

    public int[] data;
    private static final int Default_Size = 10;

    int pointer = -1;

    public deque(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        pointer++;
        data[pointer] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            System.out.println("Cannot pop from the empty stack");
            // or--> throw new Exception("Can't pop from the empty Stack!!")
        }
        // int removed = data[ptr]
        //  ptr--;
        // return removed
        // or
        return data[pointer--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot pop from an empty stack!!");
        }
        return data[pointer];
    }
    private boolean isFull(){

        return pointer == data.length-1;
    }

    private boolean isEmpty(){
        return pointer == -1;
    }

}