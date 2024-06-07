public class insertionsort{
    public static void insertion(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            int prev=i-1;
            int curr=a[i];
            // finding out the corrrect position to insert 
            while(prev>=0 && a[prev]>curr){
                a[prev+1]=a[prev];
                prev--;
            }
            //insert 
            a[prev+1]=curr;


        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        int a[]={5,4,3,1,2};
        insertion(a);
    }
}