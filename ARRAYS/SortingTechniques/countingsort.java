public class countingsort{
    public static void countingSort(int a[]){
        int n=a.length;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest=Math.max(largest,a[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<n;i++){
            count[a[i]]++;
        }
        for(int i=1;i<=largest;i++){
            count[i]+=count[i-1];
        }
        for(int i=0;i<=largest;i++){
            System.out.print(count[i]+" ");
        }
       System.out.println();
        int b[]=new int[n];
        for(int i=n-1;i>=0;i--){
            b[--count[a[i]]]=a[i];
        }
        for(int i=0;i<n;i++){
            a[i]=b[i];
        }
         for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        
    }
    public static void main(String args[]){
        int a[]={2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
        countingSort(a);
    }
}