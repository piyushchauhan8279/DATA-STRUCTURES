public class Copyconstructor {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="piyush";
        s1.roll_no=88;
        s1.password="abcd";
        System.out.println(s1.name);
        System.out.println(s1.roll_no);
        System.out.println(s1.password);
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
     

        Student s2=new Student(s1); // copy constructor 
        s2.password="abcdd";
        System.out.println(s2.name);
        System.out.println(s2.roll_no);
        System.out.println(s2.password);

        s1.marks[0]=99;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
    
}

class Student{
    String name;
    int roll_no;
    String password;
    int marks[];
   

    Student(){
       marks=new int[3];
    }

   
    // shallow copy constructor :-


    // Student( Student s1){
    //     this.name=s1.name;
    //     this.roll_no=s1.roll_no;
    //     this.marks=s1.marks;
    // }


    // deep copy constructor:-

    Student(Student s1){
         marks=new int[3];
        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        }

    }

}
