public class selection{
    public static void selectionSort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
         int temp=a[i];
         a[i]=a[min];
         a[min]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        int a[]={5,4,1,3,2};
        selectionSort(a);
    }
}