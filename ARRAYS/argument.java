import java.util.*;
public class argument{

    public static void update(int array[],int nonchangeable){
            nonchangeable=10;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter element of array :-");

        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        
        for(int i=0;i<array.length;i++){
            System.out.println("original array is :"+array[i]);
        }

        for(int i=0;i<array.length;i++){
            array[i]=array[i]+1;
        }

        for(int i=0;i<array.length;i++){
            System.out.println("Updated array is :"+array[i]);
        }

    }
    public static void main(String args[]){
        int array[]=new int[3];
        int nonchangeable=5;
        update(array,nonchangeable);
        System.out.println(nonchangeable);

        
    }
}