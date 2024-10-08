public class BalancedBst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int val){
            data=val;


        }
    }
    public static Node balancedBst(int arr[],int si,int ei){
        if(si>ei) return null;
        int mid=(si+ei)/2;
        Node root=new Node(arr[mid]);
        root.left=balancedBst(arr,si,mid-1);
        root.right=balancedBst(arr,mid+1,ei);
        return root;

    }

    public static void preorder(Node root){
        if(root==null) return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
       Node root= balancedBst(arr, 0, arr.length-1);
       preorder(root);

        
    }
    
}
