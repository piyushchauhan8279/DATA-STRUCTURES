public class Constructor{
    public static void main(String[] args) {
        Student st=new Student("piyush",50);
        System.out.println(st.name);
        System.out.println(st.roll_no);
        
    }
    
}

class Student{
    String name;
    int roll_no;

    Student(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
    }
}