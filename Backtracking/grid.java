
public class grid {
    public static int gridways(int i,int j,int n,int m){
        //base case

        if(i==n-1 && j==m-1){ // condn for last cell
            return 1;
        }

        else if(i==n || j==n){ // boundary condn
            return 0;

        }
        int w2=gridways(i+1, j, n, m); //down
        int w1=gridways(i, j+1, n, m); //right 
        
        return w1+w2;

    }
    public static void main(String[] args) {
       
        System.out.println(gridways(0, 0, 2, 3));


    }
    
}
