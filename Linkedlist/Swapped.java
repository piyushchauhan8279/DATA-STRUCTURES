public class Swapped {
    public static Node head;

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }

    }
    public void  swapped(int x,int y){
        Node temp=head;
        Node store=new Node(0);

        while(temp!=null){

            if(temp.data==x){
                store.data=temp.data;
                

            }
            if(temp.data==y){
                temp.data=temp.data;
                
            }
            temp.data=store.data;
           
            
        }
       

    }

    public static void main(String[] args) {
        Swapped ll = new Swapped();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
        ll.head.next=new Node(3);
        ll.head.next=new Node(4);

        System.out.println("original linkedlist"+ll);

        System.out.println(ll.swapped(2, 4));



    }
    
}
