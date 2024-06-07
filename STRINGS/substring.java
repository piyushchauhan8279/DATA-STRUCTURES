public class substring{
    public static void substring(String str,int si,int ei){
        // for(int i=si;i<ei;i++){
        //     System.out.print(str.charAt(i));
        // }

        System.out.print(str.substring(0,5));
    }
    public static void main(String args[]){
        String str="hello world";
        int si=0;
        substring(str,si,5);
    }
}