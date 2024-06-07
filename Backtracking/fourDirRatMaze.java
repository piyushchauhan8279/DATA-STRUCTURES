public class fourDirRatMaze {

    public static void printWays(int sr,int sc,int er,int ec,String str,boolean[][] isVisited){
        //base case
        if(sr<0 || sc<0){
            return;
        }
        if(sr>er||sc>ec){
            return;
        }
        if(isVisited[sr][sc]==true){
            return;
        }
       
        if(sr==er && sc==ec){
            System.out.println(str);
            return;
        }
        


        // recursion funcn
        isVisited[sr][sc]=true;
        //right
        printWays(sr, sc+1, er, ec, str+"R", isVisited);

        // down
        printWays(sr+1, sc, er, ec, str+"D", isVisited);

        // left
        printWays(sr, sc-1, er, ec, str+"L", isVisited);

        //up
        printWays(sr-1, sc, er, ec, str+"U", isVisited);

        isVisited[sr][sc]=false;



    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        boolean isVisited[][]=new boolean[n][m];
        printWays(0, 0, n-1, m-1, "", isVisited);
    }
    
}
