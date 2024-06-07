public class keyIndices {
    public static void printIndices(int a[],int key,int i){
        if(i==a.length){
            return;
        }
        if(key==a[i]){
            System.out.print(i+" ");
        }
        printIndices(a, key, i+1);
    }
    public static void main(String[] args) {
        int a[]={3,2,4,5,6,2,7,2,2};
        printIndices(a, 2,0);

    }
}
