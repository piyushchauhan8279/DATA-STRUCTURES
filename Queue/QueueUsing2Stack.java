import java.util.*;
public class QueueUsing2Stack {
    public static class QueueStk{
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();

        // isEmpty()

        public  boolean isEmpty(){
            return s1.isEmpty();
        }

        // add() --> O(n)

        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());

            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        // remove--> O(1)

        public int remove(){
            if(s1.isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return s1.pop();
        }

         // peek--> O(1)

         public int peek(){
            if(s1.isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return s1.peek();
        }



    }
    public static void main(String[] args) {
        QueueStk q =new QueueStk();
       
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        
    }
    
}
