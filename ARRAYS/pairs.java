public class pairs{
    public static void pairs(int a[]){
        int tp=0;
        for(int i=0;i<a.length;i++){
            // int curr=a[i];
            for(int j=i+1;j<a.length;j++){
                // int next=a[j];
                System.out.print("("+a[i]+","+a[j]+")");
                tp++;
            }
            System.out.print("\n");
        }
        System.out.println("total no. of pairs ="+ tp);
    }
    public static void main(String args[]){
        int a[]={2,4,6,8,10};
        pairs(a);
    }
}

// time complexity = O(n^2)