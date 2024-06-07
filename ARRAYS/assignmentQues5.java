public class assignmentQues5{
    public static void triplets(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    System.out.print("("+a[i]+","+a[j]+","+a[k]+")");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int a[]={-1,0,1,2,-1,4};
        triplets(a);


        }
    }