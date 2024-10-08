public class Delete {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data=data;
        }

    }

    public static void inorder(Node root){
        if(root==null) return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    public static Node delete(Node root,int val){

        // search 

        if(root.data<val){
           root.right= delete(root.right, val);

        }
        else if(root.data>val){
           root.left= delete(root.left, val);
        }
        else{
            // case 1 :- leaf node

            if(root.left==null && root.right==null){
                return null;
            }

            // case 2:- single child 

            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

            
                // case 3:- both child 
                Node Is=findInorderSuccessor(root.right);
                root.data=Is.data;
                root.right=delete(root.right,Is.data);
            

            

          
        }
        return root;

        

    }

    // inorderSuccessor funcn:-

    public static Node findInorderSuccessor(Node root){
        while (root.left!=null) {
            root=root.left;

            
        }
        return root;
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.left.left.left=new Node(1);
        root.left.left.right=new Node(4);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(14);

        inorder(root);

        delete(root, 8);
        System.out.println();
        inorder(root);
        
    }
    
}
