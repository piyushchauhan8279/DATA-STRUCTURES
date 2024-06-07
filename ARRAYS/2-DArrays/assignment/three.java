public class three{
    public static void transpose(int a[][]){
        int b[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                b[j][i]=a[i][j];
            }
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int a[][]={
        {1,2,3},
        {4,5,6},
        {7,8,9}};
        transpose(a);

    }
}