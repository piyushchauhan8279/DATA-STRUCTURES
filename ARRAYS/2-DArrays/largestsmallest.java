import java.util.*;
public class largestsmallest{
    public static int largest(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(largest<matrix[i][j]){
                    largest=matrix[i][j];
                }
            }
        }
        return largest;
    }

    public static int smallest(int matrix[][]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(smallest>matrix[i][j]){
                    smallest=matrix[i][j];
                }
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Largest element is :-  "+largest(matrix));
        System.out.println();
        System.out.println();
        
        System.out.println("Smallest element is :--  "+smallest(matrix));


    }
}