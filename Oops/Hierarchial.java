public class Hierarchial {
    public static void main(String[] args) {
        Fish whale=new Fish();
        whale.breath();
    }
    
}
class Animal{

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breath");
    }

    String skinColor;

}

class Fish extends Animal{
    void fish(){
        System.out.println("swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flying");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walking");
    }
}