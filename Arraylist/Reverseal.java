

import java.util.ArrayList;

public class Reverseal {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(i);
        }
        System.out.println("ArrayList is "+list );

        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i));        
        }
       
    }

   
    
}
