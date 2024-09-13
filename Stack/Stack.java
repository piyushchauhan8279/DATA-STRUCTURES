import java.util.ArrayList;

public class Stack {
    // statck implementation using Arraylist
    public static class StackA {
        static ArrayList<Integer> list = new ArrayList<>();

        // isEmpty function

        public static boolean isEmpty() {
            return list.size() == 0;

            // if(list.size()==0){
            // return true;
            // }
            // return false;
            // }

        }
        // push function

        public static void push(int data) {
            list.add(data);
        }

        // pop function
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.get(list.size() - 1));
            return top;
        }

        // peek function

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            return top;
        }

    }

    // stack implementation using Linkedlist:-
    public static class StackL{

        public static Node head=null;

        public static class Node{
            int data;
            Node next;

            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }

        // isEmpty funtion:-

        public static boolean isEmpty(){
            return head==null;
        }

        // push function:-

        public static void push(int data){
            Node newnode = new Node(data);
            if(isEmpty()){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        
        }

        // pop function :-

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        // pop function :-

        public static int peek(){
            if(head==null){
                return -1;
            }
            
            return head.data;
        }



    }

    // stack implementation using Arrays:-

    public static class StackArr{
        static int arr[];
        static int top;
        static int size;

        // array capacity:-

        public static void arrayCapacity(int capacity){
            arr=new int [capacity];
            top=-1;
            size=capacity;


        }

        // isEmpty:-

        public static boolean isEmpty(){
           return top==-1;
        }

        // push method:-

        public static void push(int data){
            if(top==size-1){
                System.out.println("overflow cond ");
                return;
            }
            arr[++top]=data;
        }

        // pop method :-

        public static int pop(){
            if(top==-1){
                System.out.println("underflow condition");
                return -1;
            }
         
             return arr[top--];           
        }

        // peek function :--

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[top];
        }
    }

    public static void main(String[] args) {

        // StackA s = new StackA();
        // StackL s=new StackL();
        StackArr s = new StackArr();
        s.arrayCapacity(5);

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        

        }
        

    }
}