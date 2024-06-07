public class twoDirDeadBlockRM {
    public static void printWays(int maze[][],int sr,int sc,int er,int ec,String str){
        //base case 
        if(sr==er && sc==er){
            System.out.println(str);
            return;
        }
        if(sr>er || sc>ec){
            return;
        }


        // recursion step
        if(maze[sr][sc]==0){
            return;
        }
        

        //right move
        printWays(maze, sr, sc+1, er, ec, str+"R");

        // down move

        printWays(maze, sr+1, sc, er, ec, str+"D");

    }
    public static void main(String[] args) {
        int maze[][]={
         {1,0,1}
        ,{1,1,1}
        ,{0,1,1}};
        int n=maze.length;
        printWays(maze, 0, 0,n-1,n-1, "");

    }  
    
}
