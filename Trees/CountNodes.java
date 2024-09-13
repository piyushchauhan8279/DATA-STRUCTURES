public class CountNodes {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;

        }
    }
    public static int count(Node root){
        if(root==null) return 0;

        int leftcount=count(root.left);
        int rightcount=count(root.right);
        return leftcount+rightcount+1;


    }
    
    public static void main(String[] args) {
       
        Node root =new Node(1);
        root.left =new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(4);
        root.right=new Node(3);
        root.right.right=new Node(3);
        
        System.out.println(count(root));
        
    }
    
}
