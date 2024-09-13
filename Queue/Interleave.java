import java.util.LinkedList;
import java.util.Queue;
public class Interleave {
    public static  Queue<Integer> interleaveTwoQueues(Queue<Integer> Original){

        Queue<Integer> first=new LinkedList<>();
        int size=Original.size();
        int i=0;
        while(i<size/2){
            int num=Original.remove();
            first.add(num);
            i++;
        }
      
        
        while(!first.isEmpty()){
            Original.add(first.remove());
            Original.add(Original.remove());
        }
        return Original;


        
    }
    public static void main(String[] args) {
        Queue<Integer> Original=new LinkedList<>();
        for(int i=1;i<=10;i++){
            Original.add(i);
        }
        System.out.println("Original Queue is "+Original);
        
        
        System.out.println("After InterLeave two Halves Queue is  "+interleaveTwoQueues(Original));
        
        
    }
    
}
