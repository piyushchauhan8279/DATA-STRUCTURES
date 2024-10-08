public class ValidateBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data=data;
        }
    }
    public static boolean isValidBst(Node root,Node min,Node max){
        if(root==null) return true;
        if(min!=null && root.data<=min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }
        return isValidBst(root.left, min,root) && isValidBst(root.right,root,max);


    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(2);
        root.left.left=new Node(1);
        root.left.right=new Node(4);
        
        root.right=new Node(5);
        
       

        if(isValidBst(root, null, null)){
            System.out.println("valid bst");
        }
        else{
            System.out.println("invalid bst");
        }
    }

    
}
