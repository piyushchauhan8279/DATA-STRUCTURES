public class Multilevel_Inheritance {
    public static void main(String[] args) {

        Dogs honey =new Dogs();
        honey.skinColor="black";
        System.out.println(honey.skinColor);
        honey.legs=4;
        System.out.println(honey.legs);
        honey.eat();
        
    }  
}

class Animal{
    String skinColor;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}

class Mammal extends Animal{
    int legs;
}

class Dogs extends Mammal{
    String breeds;
}
