import java.util.Scanner;
public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number whose factorial you want to find out :-");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
