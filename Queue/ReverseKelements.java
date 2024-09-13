import java.util.*;
public class ReverseKelements {
    public static void reverse(Deque<Integer> q,int k){

        Queue<Integer> helper=new LinkedList<>();
        int count=1;
        while(count!=k+1){
            helper.add(q.removeFirst());
            count++;
        }
        while(!helper.isEmpty()){
            q.addFirst(helper.remove());
          
        }
        System.out.println("Queue after reverse "+ k + "elements "+q);



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        Deque<Integer> q=new LinkedList<>();
        for(int i=1;i<=10;i++){
            q.addLast(i*10);
        }
        System.out.println("Original Queue is "+q);
        System.out.println("Enter K");
        int k=sc.nextInt();
        reverse(q,k);

    }
    
}
