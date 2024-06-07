import java.util.Collections;
import java.util.Arrays;
class inbuilt{
    public static void sort(Integer a[]){
        Arrays.sort(a,0,3,Collections.reverseOrder());
        for(Integer i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        Integer a[]={1,2,3,4,5,6 };
        sort(a);

    }
}