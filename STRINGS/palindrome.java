class palindrome{
    public static boolean isPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                
                System.out.println(" NOt Palindrome ");
                return false;
            }
        }
        System.out.println(" palindrome");
        return true;
    }
    public static void main(String args[]){
        String s="123";
        isPalindrome(s);

    }
}