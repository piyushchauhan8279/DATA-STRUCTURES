import java.util.Stack;
public class Reverse2 {

    public static void pushBottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        pushBottom(s, data);
        s.push(top);
    }

    public static void reverse(Stack <Integer> s){
        // base case 
        if(s.isEmpty()){
            return;
        }


        // recursion 

        int top=s.pop();
        reverse(s);
        
       
        pushBottom(s,top); 

    }

    public static void main(String[] args) {


        Stack <Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);


        reverse(s);


        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    }

    
}
