public class Quick_Sort{
    public static int partition(int arr[],int si,int ei){
        // pivot element
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<=ei;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void quick_sort(int arr[],int si,int ei){
        // base case 
        if(si>=ei){
            return;
        }
      int pIdx=  partition(arr, si, ei);
        quick_sort(arr, si, pIdx-1 );
        quick_sort(arr, pIdx+1, ei );
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quick_sort(arr, 0, arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}