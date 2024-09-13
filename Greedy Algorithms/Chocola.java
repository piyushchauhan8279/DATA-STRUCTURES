import java.util.Collections;
import java.util.Arrays;

public class Chocola {
    public static void main(String[] args) {
        int n=4;
        int m=6;
        Integer costVar[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};

        Arrays.sort(costVar,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int v=0;
        int h=0;
        int vp=1;
        int hp=1;
        int cost=0;

        while(v<costVar.length && h<costHor.length){
            if(costVar[v]<=costHor[h]){
                cost=cost+(costHor[h]*vp);
                hp++;
                h++;
            }
            else{
                cost=cost+(costVar[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<costHor.length){
            cost=cost+(costHor[h]*vp);
                hp++;
                h++;
        }
        while(v<costVar.length){
            cost=cost+(costVar[v]*hp);
                vp++;
                v++;
        }
        System.out.println(cost);
    }
    
}
