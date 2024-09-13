import java.util.ArrayList;

public class LowestAncestor {
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
    public static boolean getpath(ArrayList<Node> path,int n,Node root){
        
        if(root==null) return false;
        path.add(root);
        if(root.data==n){
            return true ;
        }
        boolean left=getpath(path, n, root.left);
        boolean right=getpath(path, n, root.right);
        if(left || right){
            return true;
        }
        path.remove(path.size()-1);
        return false;


    }
    public static Node  lca(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();
        getpath(path1,n1,root);
        getpath(path2,n2,root);
        int i=0;
        for(;i<path1.size()&& i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }

        return path1.get(i-1);

    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.right=new Node(7);
        root.right.left=new Node(6);
        
        System.out.print(lca(root, 6, 7).data);
        
    }
    
}
