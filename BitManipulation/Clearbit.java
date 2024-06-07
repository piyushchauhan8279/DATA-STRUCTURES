public class Clearbit{
    public static int clearIthBit(int n,int i){
        int bitMarks=~(1<<i);
        return n & bitMarks;
    }
    public static void main(String args[]){
        int n=5;
        int i=2;
        System.out.println(clearIthBit(n,i));

    }
}