import java.util.ArrayList;

public class MergeBst {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;

        }
    }
    public static void getInorder(ArrayList<Integer> arr,Node root){
        if(root==null) return ;
        getInorder(arr, root.left);
        arr.add(root.data);
        getInorder(arr, root.right);


    }

    public static Node createBst(ArrayList<Integer> finalArr,int si , int ei){
        if(si>ei) return null;
        int mid=(si+ei)/2;
        Node root=new Node(finalArr.get(mid));
        root.left=createBst(finalArr,si,mid-1);
        root.right=createBst(finalArr, mid+1, ei);
        return root;


    }

    public static void preorder(Node root){
        if(root==null) return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void mergeBst(Node root1,Node root2){
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        getInorder(arr1, root1);
        getInorder(arr2, root2);
        ArrayList<Integer> finalArr=new ArrayList<>();
        int i=0,j=0;

        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }
            else{
                finalArr.add(arr2.get(j));
                j++;

            }

        }
        while(i<arr1.size()){
            finalArr.add(arr1.get(i));
                i++;
        }

        while(j<arr2.size()){
            finalArr.add(arr2.get(j));
                j++;

        }

        Node root=createBst(finalArr,0,finalArr.size()-1);

        preorder(root);




    }
    public static void main(String[] args) {
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);
        mergeBst(root1, root2);

        
    }
    
}
