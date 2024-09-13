public class BalancedString {
    public static void main(String[] args) {
        String str="LRRRRLLRLLRL";
        int L=0;
        int R=0;
        int ans=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='L'){
                L++;
            }
            else{
                R++;
            }
            if(L==R){
                ans+=1;
                L=0;
                R=0;

            }
        }
        System.out.println("Total Balanced Substring Partition is :"+ans );
    }
    
}
