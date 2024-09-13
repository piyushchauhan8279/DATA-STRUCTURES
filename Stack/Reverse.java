import java.util.Stack;
public class Reverse {
    public static void reverseStack(Stack <Integer> s,Stack <Integer> s2){
        
        while(!s.isEmpty()){
            int top=s.pop();
            s2.push(top);
        }

    }
    public static void main(String[] args) {

        Stack <Integer> s=new Stack<>();
        Stack <Integer> s2=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("original  statck");
        System.out.println(s);
        reverseStack(s,s2);

        System.out.println("reversed statck");
        System.out.println(s2);
        // while(!s2.isEmpty()){
        //     System.out.println(s2.peek());
        //     s2.pop();
        // }      
    }
    
}
