import java.util.*;
public class QueueUsing2Stack2 {
    static Stack<Integer> s1= new Stack<>();
    static Stack<Integer> s2= new Stack<>();

    // isEmpty()

    public static boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }

    // add()--> O(1)

    public static void add(int data){
        if(!s1.isEmpty()){
            s1.push(data);
        }
        else{
            s2.push(data);
        }
    }

    // remove()---> O(n)

    public static int remove(){
        int top=-1;
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }

        if(!s1.isEmpty()){
            while(!s1.isEmpty()){
                top=s1.pop();
                // if(s1.isEmpty()){
                //     break;
                // }
                s2.push(top);
                
            }
            while(!s2.isEmpty()){
                top=s2.pop();
                if(s2.isEmpty()){
                    break;
                }
                s1.push(top);
            }
        }
        else{
            while(!s2.isEmpty()){
                top=s2.pop();
                if(s2.isEmpty()){
                    break;
                }
                s1.push(top);
            }
        }
        return top;

    }

    public static int peek(){
        int top=-1;
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }

        if(!s1.isEmpty()){
            while(!s1.isEmpty()){
                top=s1.pop();
                // if(s1.isEmpty()){
                //     break;
                // }
                s2.push(top);
                
            }
            while(!s2.isEmpty()){
                top=s2.pop();
                // if(s2.isEmpty()){
                //     break;
                // }
                s1.push(top);
            }
        }
        else{
            while(!s2.isEmpty()){
                top=s2.pop();
                // if(s2.isEmpty()){
                //     break;
                // }
                s1.push(top);
            }
        }
        return top;

    }

   
    public static void main(String[] args) {
        // QueueUsing2Stack2 q=new QueueUsing2Stack2();
        add(1);
        add(2);
        add(3);
        add(4);
        while(!isEmpty()){
            System.out.println(peek());
            remove();
            
        }

        
    }
    
}
