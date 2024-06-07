public class lastOccurence {

    public static int returnIndex(int a[],int key,int i){

        // base case
        // if(i==a.length){
        //     return -1;
        // }
        // int isFound=returnIndex(a, key, i+1);
        // if(isFound!=-1){
        //     return isFound;
        // }

        // check for self:-
        // if(a[i]==key){
        //     return i;
        // }

        // return isFound;


        // clean code:-

        if(i==a.length){
                 return -1;
             }
        int isFound=returnIndex(a, key, i+1);
        if(isFound==-1 && key==a[i]){
            return i;
        }
        return isFound;

    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int key=6;
        int i=0;
        System.out.println(returnIndex(a, key, i));
    }
}
