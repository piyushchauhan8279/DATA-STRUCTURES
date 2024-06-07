public class Hybrid { 
    public static void main(String[] args) {
        Peacock  p1= new Peacock();
        p1.fly();
        Human h1=new Human();
        h1.legs=4;
        System.out.println(h1.legs);
        h1.eat();
    }
    
}
class Animal{
    String skinColor;
    void breath(){
        System.out.println("breath");
    }
    void eat(){
        System.out.println("eats");
    }
}

class Fish extends Animal{
    int fins;

}
class Bird extends Animal{
    void fly(){
        System.out.println("flying");
    }
}
class Mammal extends Animal{
    int legs;
}

class Tuna extends Fish{
    void nonvegs(){
        System.out.println("eat nonveg only ");
    }
}
class setColorhark extends Fish{
    int  length;
}

class Peacock extends Bird{
    void dance(){
        System.out.println("dance");
    }
}
class Dog extends Mammal{
    void cute(){
        System.out.println("so cute");
    }
}
class Cat extends Mammal{
    void naughty(){
        System.out.println("naughty");
    }
}
class Human extends Mammal{
    void decisions(){
        System.out.println("take decisions");
    }
}