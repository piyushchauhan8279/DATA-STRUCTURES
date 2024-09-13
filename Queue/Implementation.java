import java.util.*;
public class Implementation {

    public  static class QueueArr{

        static int a[];
        static int size;
        static int rear;

          QueueArr(int n){
            a=new int[n];
            size=n;
            rear=-1;

        }

        // isEmpty()

        public static boolean isEmpty(){
            return rear==-1;
        }

        // add()

        public static void add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }

            rear++;
            a[rear]=data;

        }

        // remove()

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            
            int front = a[0];
            for(int i=0;i<rear;i++){
                a[i]=a[i+1];
            }
            rear--;
            return front;

        }

        // peek()

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return a[0];

        }

    }

    public static class CircularQueue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        CircularQueue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;


        }

        // isEmpty()

        public static boolean isEmpty(){
            return rear ==-1 && front ==-1;
        }
        // isfull()

        public static boolean isfull(){
            return (rear+1)%size==front;
        }

        // add()

        public static void add(int data){
            if(isfull()){
                System.out.println("queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;

        }

        // remove()

        public static int remove(){
            if (isEmpty()) {
                System.out.println("queue is already empty ");
                return -1;
            }
            int result = arr[front];

            if(rear==front){
                rear=front=-1;
            }
            else{
                
            front=(front+1)%size;

            }
            
            return result;
        }

        // peek()

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
               return -1;
            }
            return arr[front];
        } 


    }

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class QueueLL{
        static Node head=null;
        static Node tail=null;

        // isEmpty()

        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        // add()

        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=tail=newNode;

            }
            tail.next=newNode;
            tail=newNode;

        }

        // remove()

        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1 ;

            } 
            int front = head.data;
            if(head==tail){
                head=tail=null;
            }
            else{

            
            head=head.next;
            }
            return  front;
        }
         
        // peek()

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;


        }

    }


    public static void main(String[] args) {
        // QueueArr q =new QueueArr(3);
        CircularQueue q =new CircularQueue(3);
        
        // QueueLL q =new QueueLL();

        // Queue<Integer> q=new LinkedList<>();
        // Queue<Integer> q =new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println( q.remove());
       
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}