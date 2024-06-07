public class update{
     public static int setBit(int number ,int i){
        int bitMark=1<<i;
        return number | bitMark;

    }

       public static int clearBit(int number ,int i){
        int bitMark=~(1<<i);
        return number & bitMark;

    }
     public static int  update(int number,int i,int n){
        if(n==1){
            setBit(number , i);
        }
        
             return clearBit(number,i);


     }
    public static void main(String args[]){
        int number=5;
        int i=0;
        int n=1;
        n=clearBit(number,i);
        System.out.println(update(number,i,n));
    }
   
}