import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        ArrayList<Integer> list=new ArrayList<>();

        Arrays.sort(coins,Comparator.reverseOrder());
        int totalcoins=0;
        int value=2980;

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=value){
                while(coins[i]<=value){
                    totalcoins++;
                    list.add(coins[i]);
                    value-=coins[i];
                }
                if(value==0){
                    break;
                }
            }
        }
        System.out.println("total used coins :"+totalcoins);
     System.out.println(list);
        
    }
    
}
