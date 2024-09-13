import java.util.Stack;
public class Pushbottom {

    public static void pushBottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        pushBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Original stack elements :-");
        
        System.out.println(s);
     
        pushBottom(s, 4);
        System.out.println("Stack after add data at bottom :- ");
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }



       


    }
    
}
