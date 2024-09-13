
import java.util.Arrays;
import java.util.Comparator;

public class PairChain {
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
       
        int chianlen=0;

        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        chianlen=1;
       
        int chainEnd=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>chainEnd){
                chianlen++;
                
                chainEnd=pairs[i][1];
            }

        }
        System.out.println("no. of maximum pairs in chain "+chianlen);
       



    }
    
}
