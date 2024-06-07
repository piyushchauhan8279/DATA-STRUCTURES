public class twoDirectionRatMaze {
    public static void printPaths(int sr,int sc,int er,int ec,String str){
        //base case

        if(sr>er || sc>ec){
            return ;
        }
        if(sr==er && sc==ec){
            System.out.println(str);
            return ;
        }
        //recursion
        
        //right move

        printPaths(sr, sc+1, er, ec, str+"R");

        //down ,move

        printPaths(sr+1, sc, er, ec, str+"D");

    }
    public static void main(String[] args) {
        int n=3;
        int m=4;
        
        printPaths(0, 0, n-1, m-1, "");
    }
    
}
