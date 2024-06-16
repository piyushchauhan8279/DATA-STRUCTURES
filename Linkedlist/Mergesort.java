class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Mergesort {

    Node head;

    // Method to get the middle of the linked list
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid
    }

    // Merge sort method
    public Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the list
        Node mid = getMid(head);

        // Divide the list into two halves
        Node rightHead = mid.next;
        mid.next = null;

        // Recursively sort the two halves
        Node newLeft = mergesort(head);
        Node newRight = mergesort(rightHead);

        // Merge the sorted halves
        return merge(newLeft, newRight);
    }

    // Merge two sorted linked lists
    public Node merge(Node head1, Node head2) {
        Node mergedll = new Node(-1); // Dummy node
        Node temp = mergedll;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // If there are remaining elements in either list
        if (head1 != null) {
            temp.next = head1;
        } else if (head2 != null) {
            temp.next = head2;
        }

        return mergedll.next; // Return the actual head
    }

    // Helper method to print the linked list
    public void printLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Mergesort ll = new Mergesort();

        // Create a linked list
        ll.head = new Node(4);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(1);
        ll.head.next.next.next = new Node(3);

        // Print the original list
        System.out.println("Original List:");
        ll.printLL();

        // Sort the list using merge sort
        ll.head = ll.mergesort(ll.head);

        // Print the sorted list
        System.out.println("Sorted List:");
        ll.printLL();
    }
}
