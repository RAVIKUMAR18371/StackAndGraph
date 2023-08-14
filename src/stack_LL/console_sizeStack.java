package stack_LL;
import java.util.Stack;
import java.util.Scanner;
public class console_sizeStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("push the element in the Stack");
        Stack<Integer> s1 = new Stack<>();
        for(int i = 0; i < 10; i++){
            s1.push(sc.nextInt());
        }
       while(!(s1.isEmpty())){
        System.out.print(s1.pop()+" ");
    }
    }
}
