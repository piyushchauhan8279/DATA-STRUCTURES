

import java.util.*;

public class Monotonic {
    public static boolean isMonotonic(ArrayList<Integer> list) {
       boolean isIncreasing =true;
       boolean isDecreasing =true;
       for(int i=0;i<list.size()-1;i++){
        if(list.get(i)<list.get(i+1)){
            isDecreasing=false;
        }
        if(list.get(i)>list.get(i+1)){
            isIncreasing=false;
        }
       }
       return isDecreasing|| isIncreasing;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter size ");
        int n = sc.nextInt();
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            int item = sc.nextInt();
            list.add(item);
        }
        System.out.println(list);

        System.out.println(isMonotonic(list));
    }

}
