package stack_LL;
import java.util.Scanner;
import java.util.Stack;
public class BalancedParenthesis {
    static boolean BalancedParenthesis(String str){
        Stack<Character> s1 = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            s1.push(str.charAt(0));
        }
        String str1 = "]}))";
        if(str1.charAt(0) == s1.peek()){
            System.out.println(s1.pop());
        }
        else{
           s1.push(str1.charAt(0));
        }

        if(str1.charAt(1) == s1.peek()){
            System.out.println(s1.pop());
        }
        else{
            s1.push(str1.charAt(1));
        }
        if(str1.charAt(2) == s1.peek()){
            System.out.println(s1.pop());
        }
        else{
            s1.push(str1.charAt(2));
        }
        if(str1.charAt(3) == s1.peek()){
            System.out.println(s1.pop());
        }
        else{
            s1.push(str1.charAt(3));
        }

        if(s1.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = "(({[";

        System.out.println(BalancedParenthesis(str));

    }
}
