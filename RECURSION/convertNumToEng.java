public class convertNumToEng {
     static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void main(String[] args) {
        int number=2024;
        printDigit(number);

    }
    public static void printDigit(int number){
        if(number==0){
            return ;
        }
        int lastdigit=number%10;
        printDigit(number/10);
        System.out.print(digits[lastdigit]+" ");
    }
}
