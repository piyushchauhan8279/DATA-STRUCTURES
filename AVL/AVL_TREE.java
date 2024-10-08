public class AVL_TREE{

    // Node Class
    static class  Node {
        int data;
        Node left;
        Node right;
        int height;

        public Node(int data){
            this.data=data;
            height=1;
        }       
    }

    public static Node root;

    //height function

    public static int height(Node root){
        if(root==null) return 0;
        return root.height;
    }

    // Right rotate subtree rooted with y

public static Node rotateRight(Node y) {
    Node x = y.left;
    Node T2 = x.right;

    // rotation using 3 nodes

    x.right = y;
    y.left = T2;

    // update heights

    y.height = Math.max(height(y.left), height(y.right)) + 1;
    x.height = Math.max(height(x.left), height(x.right)) + 1;

    // x is new root
    return x;
    }
    
    // Left rotate subtree rooted with x

    public static Node rotateLeft(Node x) {
    Node y = x.right;
    Node T2 = y.left;
    // rotation using 3 nodes

    y.left = x;
    x.right = T2;


    // update heights

    x.height = Math.max(height(x.left), height(x.right)) + 1;
    y.height = Math.max(height(y.left), height(y.right)) + 1;
    // y is new root

    return y;

    }
    


    // insert function 

    public static Node insert(Node root,int key){
        if(root==null) {
            return new Node(key);
        }

        if(root.data<key){
            root.right=insert(root.right, key);
        }
        else if(root.data>key){
          root.left=  insert(root.left, key);
        }
        else{
            return root;
        }

        // update height

        root.height=1+Math.max(height(root.left),height(root.right));

        // check balance factor 

        int bf=getBalanceFact(root);

        // check balance factor and cases 

        // left left case 
        if(bf>1 && key<root.left.data){
            return rotateRight(root);

        }

        // right right case 
        if(bf<-1 && key>root.right.data){
            return rotateLeft(root);
        }

        // left right case

        if(bf>1 && key>root.left.data){
            root.left=rotateLeft(root.left);
            return rotateRight(root);
        }

        // right left case 

        if(bf<-1 && key<root.right.data ){
            root.right=rotateRight(root.right);
            return rotateLeft(root);
        }

        return root;


    }

    // get balance factor function 

    public static int getBalanceFact(Node root){
        if(root==null) return 0;
        return height(root.left)-height(root.right);

    }


    // Preorder function

    public static void Preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,25};
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }

        Preorder(root);

        
    }
}