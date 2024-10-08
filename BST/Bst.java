public class Bst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    // insert function :-

    public  Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

            // return new Node(val);

            if(root.data>val){
               root.left= insert(root.left, val);

            }
            else{
                root.right=insert(root.right, val);
            }
        return root;

    }

    public static void  inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args){
        int[] values={9,6,5,2,3,1,7,4,8,10};
        Node root=null;
        Bst b=new Bst();

        for(int i=0;i<values.length;i++){
            root=b.insert(root, values[i]);
        }

        inorder(root);


        

    }
    
}
