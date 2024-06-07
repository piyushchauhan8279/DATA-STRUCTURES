class fourDirDeadBlockRM {

    public static void printWays(int maze[][],int sr,int sc,int er,int ec,String str,int [][] isVisited){
        //base case
        if(sr<0 || sc<0){
            return;
        }
        if(sr>er||sc>ec){
            return;
        }
       
        if(sr==er && sc==ec){
            System.out.println(str);
            return;
        }

        if(maze[sr][sc]==0){
            return;
        }

        if(isVisited[sr][sc]==1){
            return;
        }
        


        // recursion funcn
        isVisited[sr][sc]=1;
        //right
        printWays(maze,sr, sc+1, er, ec, str+"R", isVisited);

        // down
        printWays(maze,sr+1, sc, er, ec, str+"D", isVisited);

        // left
        printWays(maze,sr, sc-1, er, ec, str+"L", isVisited);

        //up
        printWays(maze,sr-1, sc, er, ec, str+"U", isVisited);

        isVisited[sr][sc]=0;



    }
    public static void main(String[] args) {
        
       
        int maze[][]={
            {1,0,1}
           ,{1,1,1}
           ,{0,1,1}};
           int n=maze.length;
        int isVisited[][]=new int [n][n];
        printWays(maze,0, 0, n-1, n-1, "", isVisited);
    }
    
}
