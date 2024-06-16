
import java.util.Scanner;

import java.util.ArrayList;

public class Swapping {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
       System.out.println("enter elements ");
        for(int i=0;i<n;i++){
            int item=sc.nextInt();
            list.add(item);
        }
        System.out.println(list);
        System.out.println("Enter first element index");
        int idx1=sc.nextInt();
        System.out.println("enter second element index ");
        int idx2=sc.nextInt();

        //swapping 

        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
        System.out.println(list);




    }
    
}
