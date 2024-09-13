import java.util.*;
public class KLevel2 {
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
    public static void klevel2(int k,int level,Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr= q.remove();
            
           
           if(curr==null){
            if(q.isEmpty()) break;
            level+=1;
            
            
                q.add(null);

            
           
           }
           else{
            if(level==k){
                System.out.print(curr.data+" ");

            }
            if(level>k){
                break;
            }
            
            
            
                if(curr.left!=null){
                    q.add(curr.left); 

                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                

            
            
           }
        }
        if(level<k){
            System.out.println("invalid level");
        }
       
       


    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.right=new Node(7);
        root.right.left=new Node(6);
        klevel2(5, 1, root);
        
    }
    
}
