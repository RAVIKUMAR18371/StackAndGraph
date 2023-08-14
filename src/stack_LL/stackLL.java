package stack_LL;

public class stackLL{
    public static class Node{
        int data;
        Node next;
    }
   static Node top=null;

    static boolean isEmpty(Node Top) {
         Top=top;
         if (Top == null) {
             return true;
         } else {
             return false;
         }
     }
    static boolean isFull( Node tp){
         if(tp==null){
             return true;
         }
         else{
             return false;
         }
    }
    static Node push(Node top,int value){
         if(isFull(top)){
            System.out.println("Overflow");
        }
         else{
             Node n=new Node();
             n.data = value;
             n.next = top;
             top = n;
            // return top;
         }
       return top;
    }

    static int pop(Node top){
        if(isEmpty(top)){
            System.out.println("Stack underflow");
        }
        else{
            Node n = top;
            top=top.next;
            int x = n.data;
            return x;
        }
        return -1;
    }
}
