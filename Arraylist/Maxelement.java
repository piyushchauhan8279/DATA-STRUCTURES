

import java.util.ArrayList;
import java.util.Scanner;


public class Maxelement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<5;i++){
            int input =sc.nextInt();
            list.add(input);
        }
        System.out.println(list);

        int max=Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.println("maximum element is "+max);
        
    }
    
}
