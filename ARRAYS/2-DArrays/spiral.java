public class spiral{
    public static void spiralMatrix(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;


        int startingrow=0;
        int endingRow=n-1;
        int startingCol=0;
        int endingCol=m-1;


        while(startingrow<=endingRow && startingCol<=endingCol){

            //top

            for(int j=startingCol;j<=endingCol;j++){
                System.out.print(matrix[startingrow][j]+" ");
            }
            // right

            for(int i=startingrow+1;i<=endingRow;i++){
                System.out.print(matrix[i][endingCol]+" ");
            }
            // bottom

            for(int j=endingCol-1;j>=startingCol;j--){
                if(startingrow==endingRow){
                    break;
                }
                System.out.print(matrix[endingRow][j]+" ");
            }
            // left

            for(int i=endingRow-1;i>=startingrow+1;i--){
                if(startingCol==endingCol){
                    break;
                }
                System.out.print(matrix[i][startingCol]+" ");
            }

            startingrow++;
            endingRow--;
            startingCol++;
            endingCol--;
            



        }
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
        spiralMatrix(matrix);
    }
}