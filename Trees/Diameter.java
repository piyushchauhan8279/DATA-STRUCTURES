public class Diameter {
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
    public static int height(Node root){
        if(root==null) return 0;
        int lheight= height(root.left);
        int rheight=height(root.right);
        return Math.max(lheight, rheight)+1;
    }
    public static int diameter(Node root){
        if(root==null) return 0;
        int leftDia=diameter(root.left);
        int leftheight=height(root.left);
        int rightDia=diameter(root.right);
        int rightheight=height(root.right);

        int selfDia=leftheight+rightheight+1;
        return Math.max(selfDia,Math.max(leftDia,rightDia));


    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.right=new Node(6);
        
        System.out.println(diameter(root));
    }
    
}
