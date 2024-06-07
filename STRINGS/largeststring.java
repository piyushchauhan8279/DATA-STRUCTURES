public class largeststring{
    public static void getLargest(String a[]){
        String largest=a[0];
        for(int i=1;i<a.length;i++){
            int b=largest.compareTo(a[i]);
            if(b<0){
                largest=a[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String args[]){
        String a[]={"apple","banana"};
        getLargest(a);
    }
}
// time complexity:-O(n*x)
// where n=no.of comparsion
// and x=length of string 
