public class searchkey{
    public static boolean search(int matrix[][],int key){
        // use staircase search :---

        // by using 2nd case  where we start from row=n-1

        int row=matrix.length-1;
        int col=0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==key){
                System.out.println("(" + row + "," + col +")");
                return true;
            }
            else if(matrix[row][col]<key){
                    col++;
                }
            else{
                    row--;
                }
            }
            System.out.println("not found ");
            return false;
        }
       
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=30;
        search(matrix,key);
    }
}