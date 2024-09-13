import java.util.Stack;
public class NextGreater {

    public static void findNxtGreater(int arr[],Stack<Integer> s, int NextGreater[] ){
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                NextGreater[i]=-1;
            }
            else{
                NextGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }

        for(int i=0;i<NextGreater.length;i++){
            System.out.print(NextGreater[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s= new Stack<>();
        int NextGreater[]=new int[arr.length];
        findNxtGreater(arr,s,NextGreater);
    }
    
}
