public class subArray{
    public static void subArray(int a[]){
        int ts=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+" ");
                }
                ts++;
                System.out.println();
                
            }
            System.out.println();
        }
            System.out.println(ts);
    }
    public static void main(String args[]){
        int a[]={2,4,6,8,10};
        subArray(a);
    }
}