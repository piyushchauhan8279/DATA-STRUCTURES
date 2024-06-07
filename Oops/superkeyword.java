public class superkeyword {
    public static void main(String[] args) {
        // Animal s1=new Animal();
        Dog d1=new Dog();
        
    }
    
}
class Animal{
    Animal(){
        System.out.println("animal constructor is call");
    }
}
class Dog extends Animal{
    
    Dog(){
        super();
        System.out.println("Dog constructor is call ");
    }
}