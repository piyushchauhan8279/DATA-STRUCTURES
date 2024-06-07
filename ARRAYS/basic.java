import java.util.*;
public class basic{
    public static void main(String args[]){
        int a[]=new int[5];
        System.out.println("size : "+a.length);
        Scanner sc=new Scanner(System.in);  //sc=object , help to take input 
        System.out.println("enter marks of first sub");
        a[0]=sc.nextInt();
         System.out.println("enter marks of second sub");
        a[1]=sc.nextInt();
          System.out.println("enter marks of Third sub");
        a[2]=sc.nextInt();

        System.out.println("phy:"+a[0]);
        System.out.println("chem:"+a[1]);
        System.out.println("maths:"+a[2]);

        int percentage=(a[0]+a[1]+a[2])/3;
         System.out.println("percentage is : "+ percentage+"%");

    }
}