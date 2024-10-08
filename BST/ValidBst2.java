import java.util.ArrayList;

public class ValidBst2 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    // inorder traversal
    public static void inorder(Node root,ArrayList<Integer> List){
        if(root==null){
            return;
        }
        inorder(root.left,List);
        List.add(root.data);
        inorder(root.right,List);
    }

    // isvalidBst func

    // public static void printList(ArrayList<Integer> List){
    //     for(int i=0;i<List.size();i++){
    //         System.out.print(List.get(i)+" ");
    //     }

    // }

    public static boolean isValidBst(Node root){
        ArrayList<Integer> List =new ArrayList<>();
        inorder(root,List);
        for(int i=0;i<List.size()-1;i++){
            if(List.get(i)<List.get(i+1)){
                continue;

            }
            else{
                return false;
            }
        }
        return true;
        


    }

    
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(2);
        root.left.left=new Node(1);
        root.left.right=new Node(4);
        
        root.right=new Node(5);
       
        if(isValidBst(root)){
            System.out.println("Valid Bst");
        }
        else{
            System.out.println("Invalid Bst");
        }

        
    }
    
}
