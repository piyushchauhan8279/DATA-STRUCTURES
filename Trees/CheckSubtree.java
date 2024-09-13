public class CheckSubtree {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int data){
            this.val=data;
            this.left=null;
            this.right=null;

        }

    }
    public static boolean isIdentical(Node node , Node subtree ){
        if(node==null && subtree==null) return true;
        else if(node==null || subtree==null || node.val!=subtree.val){
            return false;
        }
        if(!isIdentical(node.left, subtree.left)){
            return false;
        }
        if(!isIdentical(node.right, subtree.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root,Node subtree){
        if(root==null){
            return false;
        }
        if(root.val ==subtree.val){
            if(isIdentical(root,subtree)){
                return true;
            }
        }
        return isSubtree(root.left, subtree)|| isSubtree(root.right, subtree);

    }

    public static void main(String[] args) {

        // create tree
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root. right.right=new Node(6);

        // create subtree

        Node subtree =new Node(2);
        subtree.left=new Node(4);
        subtree.right=new Node(5);

        
        System.out.println(isSubtree(root, subtree));


    }
    
}
