package stack_LL;


public class Main {
    public static void main(String[] args) {
        Stack_using_LL_frombK s = new Stack_using_LL_frombK();
        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.print();
}

}
