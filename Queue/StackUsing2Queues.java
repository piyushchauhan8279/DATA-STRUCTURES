import java.util.*;
public class StackUsing2Queues {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();

    // isEmpty()

    public  boolean isEmpty(){
        return q1.isEmpty()&& q2.isEmpty();
    }


    // push()

    public void push(int data){

        while(!q1.isEmpty()){
            q2.add(q1.remove());


        }
        q1.add(data);
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
    }
    // pop()

    public int pop(){
        if(q1.isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return q1.remove();

    }

    // peek()

    public int peek(){
        if(q1.isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return q1.remove();

    }

    public static void main(String[] args) {

        StackUsing2Queues s=new StackUsing2Queues();

        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        
    }
    
}
