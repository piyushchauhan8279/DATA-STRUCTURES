public class one{
    
    public static void countSeven(int a[][],int key){
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println("number of "+key+"="+count);

    }
    public static void main(String args[]){
        int a[][]={{1,1,2,3},{3,1,1,4},{2,3,4,1},{1,1,6,7}};
        int key=1;
        countSeven(a,key);
    }
}