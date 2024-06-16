import java.util.ArrayList;
import java.util.Scanner;
public class MostFrequent {

    public static int mostFrequentNum(ArrayList<Integer> list,int key){
        int n=list.size();
        int[] count =new int[10];
        for(int i=1;i<list.size();i++){
            if(list.get(i-1)==key){
                count[list.get(i)]++;
            }
        }
        int maxCount=0;
        for(int i=0;i<count.length;i++){
            if(count[maxCount]<count[i]){
                maxCount=i;
            }
        }
        return maxCount;

    }
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();
        System.out.println("enter elements ");
        for(int i=0;i<size;i++){
            int items=sc.nextInt();
            list.add(items);
        }
        System.out.println(list);
        System.out.println("enter key");
        int key=sc.nextInt();

        System.out.println(mostFrequentNum(list,key));
        
    }
    
}
