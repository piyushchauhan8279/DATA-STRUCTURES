import java.util.*;
public class StkQueueUsingDeque {
     static class Stack{
        Deque<Integer> deque=new LinkedList<>();

        // isEmpty
        public boolean isEmpty(){
            return deque.isEmpty();
        }
        // push()

        public void push(int data){
            deque.addLast(data);
        }

        //pop()

        public int pop(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return deque.removeLast();

        }

         //peek()

         public int peek(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return deque.getLast();

        }
     }

     static class Queue{
        Deque<Integer> deque=new LinkedList<>();

        //isEmpty()

        public boolean isEmpty(){
            return deque.isEmpty();
        }

        // add()

        public void add(int data){
            deque.addLast(data);
        }
        // remove()
        public int remove(){
            if(deque.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return deque.removeFirst();
        }

                // peek()
                public int peek(){
                    if(deque.isEmpty()){
                        System.out.println("Queue is empty");
                        return -1;
                    }
        
                    return deque.getFirst();
                }
     }
    public static void main(String[] args) {
        Stack stk=new Stack();
        stk.push(1);
        stk.push(2);
        stk.push(3);

        while(!stk.isEmpty()){
            System.out.println(stk.peek());
            stk.pop();
        }

        Queue q=new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
