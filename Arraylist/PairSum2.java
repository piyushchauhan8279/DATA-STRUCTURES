
import java.util.ArrayList;

public class PairSum2 {
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int pivot=-1;// not a valid index
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                pivot=i; // breaking point
                break;
            }
        }
        int lp=pivot;
        int rp=pivot+1;

        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if (list.get(lp)+list.get(rp)<target){
                lp=(lp-1)%n;
            }
            else{
                rp=(rp-1+n)%n;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 21;
        list.add(14);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(pairSum1(list, target));

    }
    
}
