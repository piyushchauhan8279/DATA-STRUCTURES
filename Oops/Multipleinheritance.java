public class Multipleinheritance {
    public static void main(String[] args) {
        Bear b=new Bear();
        b.eatNonVeg();
        b.eatVeg();
    }
    
}
interface harbivorous{
    void eatVeg();
}

interface carnivorous {
    void eatNonVeg();
}
class Bear implements harbivorous,carnivorous{
    public void eatVeg(){
        System.out.println("eat grass");
    }
    public void eatNonVeg(){
        System.out.println("eat others animal");
    }
}