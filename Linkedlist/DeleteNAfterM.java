public class DeleteNAfterM {

    public static Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int data) { // constructor
            this.data = data;
            this.next = null;
        }
    }

    public Node deleteNode(int m, int n) {
        Node temp = head;

        // Traverse till the m-th node
        for (int i = 1; i < m && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            return head; // If we reach end of list before reaching m-th node
        }

        Node nodeBeforeDeletion = temp;

        // Skip the next n nodes
        Node nodeToDelete = temp.next;
        for (int j = 0; j < n && nodeToDelete != null; j++) {
            nodeToDelete = nodeToDelete.next;
        }

        // Connect the m-th node to the node after the skipped nodes
        nodeBeforeDeletion.next = nodeToDelete;

        return head;
    }

    public void printLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteNAfterM ll = new DeleteNAfterM();

        ll.head = new Node(1);
        ll.head.next = new Node(2);
        Node newnode = new Node(3);
        ll.head.next.next = newnode;
        newnode = new Node(4);
        ll.head.next.next.next = newnode;
        newnode = new Node(5);
        ll.head.next.next.next.next = newnode;
        newnode = new Node(6);
        ll.head.next.next.next.next.next = newnode;
        newnode = new Node(7);
        ll.head.next.next.next.next.next.next = newnode;
        newnode = new Node(8);
        ll.head.next.next.next.next.next.next.next = newnode;

        System.out.println("Original Linked List:");
        ll.printLL();

        ll.deleteNode(2, 2);
        System.out.println("Linked List after deletion:");
        ll.printLL();
    }
}
