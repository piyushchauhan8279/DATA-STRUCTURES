public class Basic{
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setColor("blue");
        p1.setTip(10);
        System.out.println(p1.getColor());

        System.out.println(p1.getTip());

        // Student s1 = new Student();
        // s1.percentage(98,97,95);
        // System.out.println(s1.percentage);


        // BankAccount myacc=new BankAccount();
        // myacc.username="piyush";
        // myacc.setPassword("ndjsdsb");
        // System.out.print(myacc.username);

    }

}
class Pen{
     private String color;
    private int tip;

    public String getColor() {
        return this.color;
    }

    public int getTip() {
        return this.tip;
    }


    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}

// class Student{
//     String name;
//     int age;
//     float percentage;

//     void percentage(int phy,int chem,int bio){
//         percentage=(phy+chem+bio)/3;

//     }
// }

// class BankAccount{
//   public  String username;
//     private String password;

//     void setPassword(String pwd){
//         password=pwd;
//     }
// }