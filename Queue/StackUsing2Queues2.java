import java.util.*;
public class StackUsing2Queues2 {
    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2=new LinkedList<>();

    // isEmpty()

    public static boolean isEmpty(){
        return q1.isEmpty()&& q2.isEmpty();
    }

    //push()

    public static void push(int data){
        if(!q1.isEmpty()){
            q1.add(data);
        }
        else{
            q2.add(data);
        }
    }

    // pop()

    public static int pop(){
        int top=-1;
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
         // case 1:when elements in q1
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top=q1.remove();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top);

            }
        }
        else{
            while(!q2.isEmpty()){
                top=q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
            }
        }
        return top;
    }

    // peek()

    public static int peek(){
        int top=-1;
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
         // case 1:when elements in q1
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top=q1.remove();
                // if(q1.isEmpty()){
                //     break;
                // }
                q2.add(top);

            }
        }
        else{
            while(!q2.isEmpty()){
                top=q2.remove();
                // if(q2.isEmpty()){
                //     break;
                // }
                q1.add(top);
            }
        }
        return top;
    }

    public static void main(String[] args) {
        // StackUsing2Queues2 s=new StackUsing2Queues2();
        push(1);
        push(2);
        push(3);

        while(!isEmpty()){
            System.out.println(peek());
            pop();
            
        }

    }
    
}
