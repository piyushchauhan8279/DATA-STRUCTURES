import java.util.*;
class search{
    public static boolean Search(int matrix[][],int key,int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    
                    System.out.println("key found at : -" +"("+i + ","+ j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found ");
        return false;

    }
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix element :-");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("matrix is :-");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        // int key;
       Search(matrix,1,n,m);
    }
}