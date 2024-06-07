public class Optimizedpower {
    
    public static int optimizedPow(int x,int n){
        if(n==0){
            return 1;
        }
        // int halfpowersq=optimizedPow(x, n/2)*optimizedPow(x, n/2);
        int halfpower=optimizedPow(x, n/2);
        int halfpowersq=halfpower*halfpower;
        

        if(n%2!=0){
            halfpowersq=x*halfpowersq;
        }

        return halfpowersq;

    }
    public static void main(String[] args) {

        System.out.println(optimizedPow(2, 5));
    }
}
