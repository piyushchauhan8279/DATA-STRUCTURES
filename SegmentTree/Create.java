class Create{
    static int tree[];

    // initialize function
    public static void init(int n){
        tree=new int[n*4];
    }

    // create a segment tree 

    public static int buildTree(int arr[],int i,int start,int end){
        if(start==end) {
            tree[i]=arr[start];
            return arr[start];
        }
        int mid=(start+end)/2;

        buildTree(arr, 2*i+1, start,mid);
        buildTree(arr, 2*i+2, mid+1, end);
        tree[i]=tree[(2*i)+1]+tree[(2*i)+2];
        return tree[i];


    }

    // create a function that return the sum for a given range 
    // query 

    public static int getSumUtil(int i,int si,int sj,int qi,int qj){
        // Non-Overlapping 
        if(qj<si || sj<qi) return 0;
        // overlapping
        else if(qi<=si && sj<=qj) return tree[i];
        // partial overlapping
        else{
           int mid=(si+sj)/2;
           int left= getSumUtil(2*i+1,si, mid, qi, qj);
           int right= getSumUtil(2*i+2,mid+1,sj, qi, qj);
           return left+right;
        }
    }

    public static int getSum(int arr[],int qi,int qj){
        int n=arr.length;
       return  getSumUtil(0,0,n-1,qi,qj);
    }

    // update the segment tree

    public static void update(int arr[],int idx,int newval){
        int diff=newval-arr[idx];
        arr[idx]=newval;
        int n=arr.length;
        updateUtil(idx,diff,0,n-1,0);
    }

    public static void updateUtil(int idx,int diff,int si,int sj,int i){
        // idx lies in range or not 
        // base case 

        if(idx<si || idx>sj) return;
        tree[i]+=diff;

        // not a leaf node
        if(si!=sj){
            int mid=(si+sj)/2;
            updateUtil(idx, diff, si,mid,2*i+1);
            updateUtil(idx, diff, mid+1,sj,2*i+2);

        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        init(n);
        buildTree(arr, 0, 0, n-1);  // O(N)

        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }

        System.out.println();

        int ans =getSum(arr, 0, 7); // query O(LOG N)

        System.out.println(ans);

        update(arr,2, 2);

        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();

        int ans2=getSum(arr, 0, 7);
        System.out.println(ans2);

        System.out.println();


    }
}