public class MethodOverloading {
    public static void main(String[] args) {
        CalculateSum calc=new CalculateSum();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(1,2,3));
        System.out.println(calc.sum((float)1.5,(float)2.5));
        
    }
}
class CalculateSum{
    int sum( int a,int b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
    }
}