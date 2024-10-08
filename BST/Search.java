public class Search {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int val){
            data=val;
        }
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    public static boolean isFound(int key,Node root){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return isFound(key, root.left);

        }
        else{
           return  isFound(key, root.right);
        }
        
        

    }

    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.right=new Node(6);
        root.left.left=new Node(3);
        root.left.left.left=new Node(1);
        root.left.left.right=new Node(4);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(14);

        int key=100;
        
        if(isFound(key, root)){
            System.out.println("Key is Found");
        }
        else{
            System.out.println("Key is not Found ");
        }

        

    }
    
}
