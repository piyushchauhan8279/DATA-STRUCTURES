import java.util.Scanner;

public class Min {

    static int tree[];
    
    public static void init(int n){
        tree=new int[2*n-1];
    }

    public static void buildST(int arr[],int i,int si,int sj){
        if(si==sj){
            tree[i]=arr[si];
            return;
        }
        int mid=si+(sj-si)/2;
        buildST(arr,2*i+1, si, mid);
        buildST(arr,2*i+2, mid+1, sj);
        tree[i]=Math.min(tree[2*i+1],tree[2*i+2]);

    }

    // getMin() function 

    public static int getMin(int arr[],int qi,int qj){
        int n=arr.length;
       return getMinUtil(0,0,n-1,qi,qj);

    }

    // getMinUtil() function

    public static int getMinUtil(int i,int si,int sj,int qi,int qj){
        // non overlapping 
        if(sj<qi || si>qj) return Integer.MAX_VALUE;
        // complete overlapping 
        else if(si>=qi && sj<=qj) return tree[i];
        // partial overlapping 
        else{
           int mid=si+(sj-si)/2;
           int leftmin= getMinUtil(2*i+1,si,mid, qi, qj);
           int rightmin= getMinUtil(2*i+2,mid+1,sj, qi, qj);
           return Math.min(leftmin, rightmin);
        }


    }

    // update functions 

    public static void update(int arr[],int idx,int newval){
        arr[idx]=newval;
        updateUtil(0,0,arr.length-1,idx,newval);
    }

    public static void updateUtil(int i,int si,int sj,int idx,int newval){
        //not  overlap
        if(idx<si || idx>sj) return;
        // overlap

        if(si==sj){
            tree[i]=newval;

        }
        else{
            tree[i]=Math.min(newval,tree[i]);
            int mid=si+(sj-si)/2;
            updateUtil(2*i+1,si,mid, idx, newval);
            updateUtil(2*i+2,mid+1,sj, idx, newval);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={6,8,-1,2,17,1,3,2,4};
        int n=arr.length;
        init(n);

        buildST(arr, 0, 0, n-1);


        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();

        // int min=getMin(arr, 0, 7);
        // System.out.println(min);


        // update(arr, 2, -4);
        
        // for(int i=0;i<tree.length;i++){
        //     System.out.print(tree[i]+" ");
        // }
        // System.out.println();

        
        // min=getMin(arr, 0,7);
        // System.out.println(min);

        System.out.println("Enter qi and qj");

        for(int i=1;i<=5;i++){
            int qi=sc.nextInt();
            int qj=sc.nextInt();
            
            System.out.println(getMin(arr, qi, qj));
        }

    }
    
}
