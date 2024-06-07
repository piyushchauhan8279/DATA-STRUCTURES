class diagonalsum{
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        //pd
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum=sum+matrix[i][j];
        //         }
        //         //sd
        //        else if(i+j==3){
        //             sum=sum+matrix[i][j];

        //         }
        //     }
        // }


            //OPTIMIZE APPROACH 
            // T.C =O(n^2)

            for(int i=0;i<matrix.length;i++){
                //pd
                sum=sum+matrix[i][i];

                //sd
                if(i!=matrix.length-1-i){
                    sum=sum+matrix[i][matrix.length-1-i];

                }
                
            }

        
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{0,1,2},{3,4,5,},{6,7,8}};
        System.out.println(diagonalSum(matrix));
    }
}