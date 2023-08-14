package Queue;

public class Main {// we use here throws because "pop" is using throws that is why
    // we are using throws in the signature of the  method
    public static void main(String[] args) throws Exception {
        deque stack = new deque(5);
        stack.push(3);
        stack.push(5);
        stack.push(45);
        stack.push(32);
        stack.push(23);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop()); //if we use one more Time then it return Exception
    }
}
