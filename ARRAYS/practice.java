import java.util.Arrays;
import java.util.Collections;

public class practice{
    public static void bubbleSort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }
    }

    public static void selectionSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }

    
    public static void insertion(int a[]){
        for(int i=1;i<a.length;i++){
            int curr=a[i];
            int prev=i-1;
            while(prev>=0 && a[prev]>curr){
                a[prev+1]=a[prev];
                prev--;
            }
            //insert:-
            a[prev+1]=curr;
        }
    }

            public static void inbuilt(int a[]){
                Arrays.sort(a,0,3);
                 
           }


            public static void countingSort(int a[]){
                int largest=Integer.MIN_VALUE;
                for(int i=0;i<a.length;i++){
                    largest=Math.max(largest,a[i]);
                }

                int count[]=new int[largest+1];
                for(int i=0;i<a.length;i++){
                    count[a[i]]++;
                }

                 for(int i=0;i<count.length;i++){
                    System.out.print(count[i]+" ");

                }
                System.out.println();
              
                for(int i=1;i<count.length;i++){
                    count[i]+=count[i-1];
                }
                for(int i=0;i<count.length;i++){
                    System.out.print(count[i]+" ");

                }
                System.out.println();

                int b[]=new int[a.length];
                int n=a.length;
                for(int i=n-1;i>=0;i--){
                    b[--count[a[i]]]=a[i];
                }

                for(int i=0;i<a.length;i++){
                    a[i]=b[i];
                }
                

            }

    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        int a[]={2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
        // bubbleSort(a);
        // selectionSort(a);
        // insertion(a);
        // inbuilt(a);
        countingSort(a);

        print(a);
    }
}