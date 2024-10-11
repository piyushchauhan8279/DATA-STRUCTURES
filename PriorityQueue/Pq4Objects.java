import java.util.Comparator;
import java.util.PriorityQueue;
public class Pq4Objects {
    static class Student implements Comparable<Student>{
        String Name;
        int Rank;

        public Student(String Name,int Rank){
            this.Name=Name;
            this.Rank=Rank;
        }

        @Override
        public  int compareTo( Student s2){
            return this.Rank-s2.Rank;


        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Piyush", 10));
        pq.add(new Student("Khurana", 11));
        pq.add(new Student("Somesh", 14));
        pq.add(new Student("Sachin", 9));
        pq.add(new Student("Abhishek", 3));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().Name+"->"+pq.peek().Rank);
            pq.remove();
        }       
    }
    
}
