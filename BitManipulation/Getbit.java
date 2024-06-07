public class Getbit{
    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        }
        return 1;
    }
    public static void main(String args[]){
        int n=8;
        int i=1;
        System.out.println(getIthBit(n,i));
    }
}