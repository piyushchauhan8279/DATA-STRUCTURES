import java.util.Scanner;

public class FirstOccurence {

    public static int returnIndex(int array[],int i,int key) {
        if(i==array.length){
            return -1;
        }
        if(key==array[i]){
            return i;
        }
        return returnIndex(array, i+1, key);
        
    }
    public static void main(String[] args) {
        int array[]={8,3,6,9,5,10,2,5,3};
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a key ,which first occurence you want to find out ");
        int key=sc.nextInt();
        System.out.println(returnIndex(array, i, key));


    }   
}
