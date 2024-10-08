import java.util.ArrayList;

public class PrintPaths {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int val){
            data=val;
        }
    }

    // inorder 
    public static void inorder(Node root){
        if(root==null) return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    // printPaths function 
    public static void printPath(ArrayList<Integer> List){
        for(int i=0;i<List.size();i++){
            System.out.print(List.get(i)+"->");
        }
        System.out.println("Null");
    }

    public static void printRoot2Leaf(ArrayList<Integer> path,Node root){
        if(root==null) return ;
        path.add(root.data);
        if(root.left==null && root.right==null) {
            printPath(path);
        }
        printRoot2Leaf(path, root.left);
        printRoot2Leaf(path, root.right);
        path.remove(path.size()-1);

    }

    public static void main(String[] args) {
        
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(14);
        // inorder(root);
        ArrayList<Integer> path=new ArrayList<>();
        printRoot2Leaf(path,root);



    }
    
}
