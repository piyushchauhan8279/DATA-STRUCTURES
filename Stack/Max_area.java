import java.util.Stack;
public class Max_area {

    public static int clacMaxArea(int height[]){
        int n=height.length;
        

        Stack<Integer> s= new Stack<>();
        int nextSmallerRight[]=new int[height.length];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerRight[i]=n;

            }
            else{
                nextSmallerRight[i]=s.peek();
            }
            s.push(i);
        }


            s= new Stack<>();
        int nextSmallerleft[]=new int[height.length];
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerleft[i]=-1;

            }
            else{
                nextSmallerleft[i]=s.peek();
            }
            s.push(i);
        }
        int max_area=0;
       for(int i=0;i<n;i++){
        int hgt=height[i];
        int width=nextSmallerRight[i]-nextSmallerleft[i]-1;
        int curr_area=hgt*width;
        max_area=Math.max(max_area,curr_area);
       }
       return max_area;
    }
    public static void main(String[] args) {
        int height[]={2,1,5,6,2,3};
       
        System.out.println( clacMaxArea(height));


    }
    
}
