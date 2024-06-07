public class Statickeyword {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolName="ABC";
        System.out.println(s1.schoolName);
        Student s2=new Student();
        System.out.println(s2.schoolName);
    }
    
}
class Student{
    int roll_no;
    String name;
    static String schoolName;
}