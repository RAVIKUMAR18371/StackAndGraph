package stack;
import java.util.Stack;
public class stack_By_KK {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Rohit");
        stack.push("Rahul");
        stack.push("Vinit");
        stack.push("Animesh");
        stack.push("Ravi");




        System.out.println(stack);
        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.peek());
    }
}
