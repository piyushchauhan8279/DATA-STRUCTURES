import java.util.Stack;

public class ReverseString {

    public static StringBuilder reverseString(String str){

        Stack <Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            char element=str.charAt(idx);
            s.push(element);
            idx++;
        }

        StringBuilder newstr=new StringBuilder();
        while(!s.isEmpty()){
            char curr=s.pop();
            newstr.append(curr);
        }
        return newstr;
        

    }
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(reverseString(str));      
    }
    
}
