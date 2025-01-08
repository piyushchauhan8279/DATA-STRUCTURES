public class Max {
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
        tree[i]=Math.max(tree[2*i+1],tree[2*i+2]);

    }

    // getMax() function 

    public static int getMax(int arr[],int qi,int qj){
        int n=arr.length;
       return getMaxUtil(0,0,n-1,qi,qj);

    }

    // getMaxUtil() function

    public static int getMaxUtil(int i,int si,int sj,int qi,int qj){
        // non overlapping 
        if(sj<qi || si>qj) return Integer.MIN_VALUE;
        // complete overlapping 
        else if(si>=qi && sj<=qj) return tree[i];
        // partial overlapping 
        else{
            int mid=si+(sj-si)/2;
           int leftmax= getMaxUtil(2*i+1,si,mid, qi, qj);
           int rightmax= getMaxUtil(2*i+2,mid+1,sj, qi, qj);
           return Math.max(leftmax, rightmax);
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
            tree[i]=Math.max(newval,tree[i]);
            int mid=si+(sj-si)/2;
            updateUtil(2*i+1,si,mid, idx, newval);
            updateUtil(2*i+2,mid+1,sj, idx, newval);
        }

    }
    public static void main(String[] args) {
        int arr[]={6,8,-1,2,17,1,3,2,4};
        int n=arr.length;
        init(n);

        buildST(arr, 0, 0, n-1);


        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();

        int max=getMax(arr, 0, 7);
        System.out.println(max);


        update(arr, 2, 20);
        
        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();

        
        max=getMax(arr, 0,7);
        System.out.println(max);


    }
    
}
