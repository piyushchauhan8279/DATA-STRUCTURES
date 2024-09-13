public class KLevel {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }

    }
    public static void klevel(int k,int level,Node root){
        if(root==null) return ;
        if(level==k) {
            System.out.print(root.data+" ");
        }
        klevel(k, level+1, root.left);
        klevel(k, level+1, root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.right=new Node(7);
        root.right.left=new Node(6);
        klevel(2, 1, root);

        
    }
    
}
