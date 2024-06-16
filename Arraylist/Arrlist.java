
import java.util.ArrayList;

public class Arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);        
        // list.add(3);        
        // list.add(4);        
        // list.add(5);   
        
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        System.out.println(list);

        int  element= list.get(5);
        System.out.println(element);

        list.add(5,11);
        System.out.println(list);

        System.out.println(list.contains(1));

        list.remove(5);
        System.out.println(list);

        list.set(0,11);
        System.out.println(list);
        

        System.out.println(list.size());
        
    }
    
}
