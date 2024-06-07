public class knight{
    public static boolean knightMoves(int grid[][],int row,int col,int num){
        //base case
        int n=grid.length;
        if(grid[row][col]==n*n-1){
            return true;
        }
        //recursion step
        int i=row;
        int j=col;
        
        //2 up right
        i=row-2;
        j=col+1;
        if(i>=0 && j<n && grid[i][j]==num+1){
            return knightMoves(grid,i,j,num+1);
        }
        //2 up left
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && grid[i][j]==num+1){
            return knightMoves(grid,i,j,num+1);
        }
        // 2 down right
        i=row+2;
        j=col+1;
        if(i<n && j<n && grid[i][j]==num+1){
            return knightMoves(grid,i,j,num+1);
        }
        // 2 down left
        i=row+2;
        j=col-1;
        if(i<n && j>=0 && grid[i][j]==num+1){
            return knightMoves(grid,i,j,num+1);
        }
        // 2 right up
        i=row-1;
        j=col+2;
        if(i>=0 && j<n && grid[i][j]==num+1){
            return knightMoves(grid,i,j,num+1);
        }
        // 2 right down
        i=row+1;
        j=col+2;
        if(i<n && j<n && grid[i][j]==num+1){
            return knightMoves(grid,i,j,num+1);
        }
        // 2 left up
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && grid[i][j]==num+1){
            return knightMoves(grid,i,j,num+1);
        }
        
        // 2 left down
        i=row+1;
        j=col-2;
        if(i<n && j>=0 && grid[i][j]==num+1){
            return knightMoves(grid,i,j,num+1);
        }
        return false;

    }
    public static void main(String[] args) {
        int grid[][]={{0,3,6},{5,8,1},{2,7,4}};
        if(grid[0][0]!=0){
            System.err.println("soln not possible");
        }
        else{
            System.out.println(knightMoves(grid, 0, 0, 0));

        }
    }
}