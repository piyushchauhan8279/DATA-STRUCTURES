public class Merge_Sort {
    public static void merge(int arr[],int si,int mid ,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++; 
                k++;
            }
            else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }

        while(j<=ei){
            temp[k]=arr[j];
            j++;
            k++;
        }

        // transfer the value of temp array into original array

        for( k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }


    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return ;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    
}
