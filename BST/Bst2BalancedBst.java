import java.util.ArrayList;

public class Bst2BalancedBst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int val){
            data=val;
        }
    }

    public static void getInorder(ArrayList<Integer> list,Node root){
        if(root==null) return;
        getInorder(list, root.left);
        list.add(root.data);
        getInorder(list, root.right);
    }


    public static Node balancedBst(int si,int ei,ArrayList<Integer> list){

        if(si>ei) return null;

        int mid=(si+ei)/2;
        Node root=new Node(list.get(mid));
        root.left=balancedBst(si,mid-1, list);
        root.right=balancedBst(mid+1,ei, list);

        return root;


    }

    public static void preorder(Node root){
        if(root==null) return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void   bst2BallancedBst(Node root){
        ArrayList<Integer> list=new ArrayList<>();
        // inorder func
        getInorder(list, root);


        // balanced bst func 
        root=balancedBst(0, list.size()-1, list);

        // preorder traversal
        preorder(root);




    }

    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
        bst2BallancedBst(root);

        
    }
    
}
