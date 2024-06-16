public class DoubleLL {

    public static Node head;
    public static Node tail;
    public static int size;

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    // add first:-
    public void addFirst(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;

    }

    // addlast:-

    public void addLast(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.prev = tail;
        tail.next = newnode;

        tail = newnode;

    }
    // add middle:--

    public void addMiddle(int idx, int data) {
        Node newnode = new Node(data);
        size++;
        if (idx <= 0) {
            addFirst(data);
            return;
        }
        if (idx >= size) {
            addLast(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next.prev = newnode;
        temp.next = newnode;
        newnode.prev = temp;

    }

    // remove first:-

    public int removeFirst() {
        if (head == null) {
            System.out.println(" dll is already empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;

    }

    // remove last:--

    public int removeLast() {
        if (head == null) {
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }

        // Node temp=head;
        // int i=0;
        // while(i<size-2){
        // temp=temp.next;
        // i++;
        // }
        // int val=temp.next.data;
        // temp.next=null;
        // temp.next.next.prev=null;
        // tail=temp.next;
        // size--;
        // return val;

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;

    }

    // remove middle:-

    public void removeMiddle(int idx) {
        if (size == 0) {
            System.out.println("dll is already empty");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }

        Node temp = head;
        int i = 0;
        while (i != idx - 1) {
            temp = temp.next;
            i++;

        }
        temp.next = temp.next.next;
        temp.next.next.prev = temp;

        size--;

    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        System.out.print("null<->");
        while (temp != null) {

            System.out.print(temp.data + "<->");
            temp = temp.next;

        }
        System.out.println("null");

    }

    public static void main(String[] args) {

        DoubleLL dll = new DoubleLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(10);
        dll.addLast(11);

        dll.addMiddle(3, 15);
        dll.addMiddle(4, 16);
        dll.addMiddle(5, 17);
        // dll.print();
        // System.out.println();

        // System.out.println(dll.removeFirst());
        // dll.print();
        // System.out.println(dll.removeFirst());
        // dll.print();

        // dll.removeMiddle(5);
        dll.print();
        dll.reverse();
        dll.print();

        System.out.println("size is " + size);

    }

}
