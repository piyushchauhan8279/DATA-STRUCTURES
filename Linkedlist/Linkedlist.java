import java.util.*;
public class Linkedlist {
    public static Node head;
    public static Node tail;
    public static int size = 0;

    public static class Node {
        int data;
        Node next;

        public Node(int data) { // constructor
            this.data = data;
            this.next = null;
        }
    }

    // add node at the starting of linkedList:-

    public void addFirst(int data) {

        // step 1
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;

            return;
        }
        // step 2

        newnode.next = head;

        // step 3
        head = newnode;

    }

    // add new node at the end of linkedlist:-
    public void addlast(int data) {
        // step 1 new node
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        // step 2
        tail.next = newnode;

        // step 3

        tail = newnode;

    }

    // printing a linkedlidt
    public  void printLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.print(" null ");
    }

    // insert at the middle of linkedlist

    public void addMiddle(int idx, int data) {
        Node newnode = new Node(data);
        size++;
        if (idx == 0) {
            addFirst(data);
            return;
        }
        int i = 0;
        Node temp = head;
        while (i < idx - 1) {
            temp = temp.next;
            i++;

        }

        newnode.next = temp.next;
        temp.next = newnode;

    }

    // remove first node :-
    public void removeFirst() {
        if (size == 0) {
            return;
        } else if (size == 1) {

            head = tail = null;
            size--;
            return;

        }
        head = head.next;
        size--;
        return;

    }
    // remove last

    public void removeLast() {

        Node prev = head;

        if (size == 0) {
            System.out.println("LL is Empty");
            return;
        } else if (size == 1) {

            head = tail = null;

            size = 0;
            return;

        }
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        prev.next = null;
        tail = prev;
        size--;

    }

    // remove Middle:-

    public void removeMiddle(int idx) {
        if (size == 0) {
            System.out.println("ll is empty");
            return;
        }
        if (idx < 0 || idx >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        if (idx == 0) {
            // Special case: removing the head node
            head = head.next;
            size--;
            return;
        }
        int i = 0;
        Node temp = head;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // removing the tail node
        if (idx == size - 1) {
            tail = temp;
        }
        // temp.next=null;

        temp.next = temp.next.next;
        size--;
    }

    // search iteratively
    public int searchKey(int key) {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return i + 1;
            } else {
                i++;
                temp = temp.next;
            }
        }
        return -1;
    }

    // search recursevely:-

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0; // return index
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1; // return original position
    }

    public int recurSearch(int key) {
        return helper(head, key);

    }

    // reverse linked list:-
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    // find and remove node from end :--
    public void findAndRemove(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (sz == n) {
            head = head.next;
            return;
        }
        // sz-n
        Node prev = head;
        for (int i = 1; i < sz - n; i++) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    // check if a linked list is palindrome or not :-

    // step 1 find mid node by fast and slow method

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // step 2 reverse 2nd half of linked list

    public boolean checkPalindrome() {
        Node midNode = findMid(head);

        // reverse 2nd half

        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;

        // step 3 check the left and right half

        while (right != null) {
            if (right.data != left.data) {
                return false;
            }

            right = right.next;
            left = left.next;
        }
        return true;
    }

    // detect a cycle in a linked list:--

    public static boolean isCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // remove a cycle / loop from linked list:--

   public static void removeCycle(Node head ){
        Node slow = head;
        Node fast = head;
        Boolean cycle=false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle=true;
                break;
            }
           
        }
        if(cycle==false){
            return;
        }
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;

        }

        prev.next=null;
        

   }
//    merge sort:-

//    mid element 

   private  Node getMid(Node head){
    Node slow=head;
    Node fast=head.next;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next;
        
    }
    return slow; // mid 
   }

   public   Node mergesort(Node head){
    if (head == null || head.next == null) {
        return head;
    }
    Node mid=getMid(head);

   //  divide linkedlist into two halves 

   Node rightHead=mid.next;
   mid.next=null;

   Node newright=mergesort(rightHead);
   Node newleft=mergesort(head);

   return merge(newleft,newright);


   }

   
   
   // merge 
   public Node  merge(Node head1 , Node head2){
    Node mergedll=new Node(-1);

    Node temp=mergedll;
    while(head1 !=null && head2!=null){
        if(head1.data<=head2.data){
            temp.next=head;
            head1=head1.next;
            
        }
        else{
            temp.next=head2;
            head2=head2.next;
            

        }
        temp=temp.next;
    }
        // If there are remaining elements in either list
        if (head1 != null) {
            temp.next = head1;
        } else if (head2 != null) {
            temp.next = head2;
        }


        return mergedll.next;

   }

   // Zig zag linked list:-

   public void   zigZag(Node head){

    // finding mid 
    Node slow=head;
    Node fast=head.next;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;

    }
    Node mid =slow;
   
    //  linkedlist divided into two parts and reverse the second part:-
    Node curr=mid.next;
    mid.next=null;

    Node prev=null;
    Node next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    // zig zag  merge 
    Node left=head;
    Node right=prev;
    Node leftnext;
    Node rightNext;

    while(left!=null && right!=null){
        leftnext=left.next;
        left.next=right;
        rightNext=right.next;
        right.next=leftnext;
        left=leftnext;
        right=rightNext;

    }

   }
   



    public static void main(String[] args) {

        Linkedlist ll = new Linkedlist();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addlast(4);
        ll.addlast(5);
        // ll.addMiddle(3, 3);

        // ll.printLL();
        // System.out.println();
        // System.out.println(ll.size);

        // ll.removeFirst();
        // ll.printLL();
        // System.out.println();
        // System.out.println(ll.size);

        // ll.removeLast();
        // ll.printLL();
        // System.out.println();
        // System.out.println(size);

        // ll.removeMiddle(1);
        // ll.printLL();
        // System.out.println();

        // System.out.println(size);

        // System.out.println(ll.recurSearch(20));
        // System.out.println(ll.recurSearch(3));
        // System.out.println(ll.recurSearch(5));

        // ll.reverse();
        // ll.printLL();

        // ll.findAndRemove(5);
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        //  System.out.println(isCycle(head));
        //  removeCycle(head);
        //  System.out.println(isCycle(head));
        //  ll.printLL();

        // java collection framework linkedlist:--

        // LinkedList<Integer> linkedlist=new LinkedList<>();

        // linkedlist.addFirst(8);
        // linkedlist.addFirst(1);
        // linkedlist.addFirst(4);
        // linkedlist.addLast(2);
        // linkedlist.addLast(5);
        // linkedlist.addLast(6);
        // System.out.println(linkedlist);

        // ll.head=ll.mergesort(ll.head);
        // ll.printLL();
        ll.printLL();
        System.out.println();
        ll.zigZag(head);
        ll.printLL();



        
    }
}