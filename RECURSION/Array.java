public class Array {
    public static boolean isSorted(int a[],int i){

        // with the help of iteration 

        // for(int i=0;i<a.length-1;i++){
        //     if(a[i]>a[i+1]){
        //         return false;
        //     }
        // }
        // return true;


        // with the help of recursion 

        if(i==a.length-1){
            return true;
        }
        if(a[i]>a[i+1]){
            return false;
        }
        return isSorted(a, i+1);

    }
    public static void main(String[] args) {
        int a[]={1,2,3,40,5};
        int i=0;
        System.out.println(isSorted(a,i));
    }
}
