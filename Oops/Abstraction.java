public class Abstraction {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
        h.eat();
        Dog d=new Dog();
        d.walk();
        System.out.println(h.color);
        System.out.println(h.changeColor());
    }
}
abstract class Animal{
    String color;
    void eat(){
        System.out.println("eats ");
    }
    abstract void walk();
    Animal(){
        color="black";
    }
}
 class Horse extends Animal{
     void walk()
    {
        System.out.println("walk");
    }
    String changeColor(){
        color="white";
        return color;
    }
}
class Dog extends Animal{
    void walk() {
      System.out.println("walk");       
    }
}