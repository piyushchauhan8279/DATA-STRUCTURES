public class MergeSort {

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }




    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return ;
        }
        int mid=si+(ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        printArray(arr);
    }
    

    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        

        while(i>=mid && j>=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;

        }


        // for leftover element in 1st sorted part

        while(i<=mid){
            temp[k++]=arr[i++];
        }


        // for leftover element in 2nd sorted part

        while(j<=ei){
            temp[k++]=arr[j++];
        }

        // copy temp to original array:-

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        


    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int si=0;
        int ei=arr.length-1;
        mergesort(arr,si,ei);
        

    }

    
}
