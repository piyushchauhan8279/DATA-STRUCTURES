import java.util.*;
public class Railway {
    static class Train implements Comparable<Train>{
        String name;
        String color;
        int id;
        int speed;
        int capacity;

        public Train(String name,String color,int id,int speed,int capacity){
            this.name=name;
            this.color=color;
            this.id=id;
            this.speed=speed;
            this.capacity=capacity;

        }

        @Override
        public int compareTo(Train t){
            return this.id-t.id;

        }


    }
    public static void main(String[] args) {
        PriorityQueue<Train> pq=new PriorityQueue<>();
        pq.add(new Train("Vande Bharat", "Orange", 3, 200, 900));
        pq.add(new Train("Shatabadi Express", "Red", 31, 60, 600));
        pq.add(new Train("Metro", "Blue", 10,150 , 380));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+","+pq.peek().id+","+pq.peek().speed+","+pq.peek().capacity+","+pq.peek().color+" ");
            pq.remove();

        }
        
    }
    
}
