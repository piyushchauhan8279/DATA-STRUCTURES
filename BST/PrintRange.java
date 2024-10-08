public class PrintRange {
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data=data;
        }
    }

    // inorder 
    public static void inorder(Node root){
        if(root==null) return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    // print in range function 

    public static void printInRange(int k1 , int k2 , Node root){
        if(root==null) return ;
        // case 1:- when root data lies btw k1 and k2 
        if(k1<= root.data &&  root.data<=k2){
            printInRange(k1, k2, root.left);
            System.out.print(root.data+" ");
            printInRange(k1, k2, root.right);
        }

        // case 2:- when root>k2:- search in right subtree

        else if(root.data>k2){
            printInRange(k1, k2, root.right);
        }

        // case 3:- when root<k1 :- search in left subtree

        else{
            printInRange(k1, k2, root.left);
        }

    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.left.left.left=new Node(1);
        root.left.left.right=new Node(4);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(14);

        // inorder(root);
        printInRange(5, 12, root);

    }
    
}
