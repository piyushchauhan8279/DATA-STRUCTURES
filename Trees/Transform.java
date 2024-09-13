public class Transform {
    public static  class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int transformSum(Node root){
        if(root==null) return 0;
        int leftchild=transformSum(root.left);
        int rightchild=transformSum(root.right);
        int newleft=root.left==null ? 0:root.left.data;
        int newright=root.right==null ? 0:root.right.data;
        int val=root.data;
        root.data=leftchild+newleft+rightchild+newright;

        return val;

    }
    public static void preorder(Node root){
        if(root==null) return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.right=new Node(7);
        root.right.left=new Node(6);
        transformSum(root);
        preorder(root);
    }
    
}
