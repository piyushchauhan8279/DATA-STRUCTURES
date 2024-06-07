public class two{
    public static void sum(int a[][]){
        int sum=0;
        // for(int i=1;i<=1;i++){
        //     for(int j=0;j<a[0].length;j++){
        //         sum=sum+a[i][j];
        //     }
        // }

        int i=1;
        int j=0;
        while(i==1 && j<a[0].length){
            sum+=a[i][j];
            j++;
        }
        System.out.println(sum);

    }
    public static void main(String args[]){
        int a[][]={{1,4,9},{11,4,3},{2,2,3}};
        sum(a);
    }
}