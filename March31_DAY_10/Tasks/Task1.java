class Person{
    private String sjce="hidden";   // private
    String name;                     // default
    protected int age;                // protected
    public String dept;              // public
}
class Student extends Person{
    void show(){
        System.out.println("Student Name: " +name);
        System.out.println("Student Age: " +age);
        System.out.println("Student Dept: " +dept);
    }
}
class Teacher extends Person{
    void show(){
        System.out.println("Teacher Name: " +name);
        System.out.println("Teacher Age: " +age);
        System.out.println("Teacher Dept: " +dept);
    }
}
class HOD extends Person{
    void show(){
        System.out.println("HOD Name: " +name);
        System.out.println("HOD Age: " +age);
        System.out.println("HOD Dept: " +dept);
    }
}
public class Task1{
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Edlyn"; 
        s.age = 20; 
        s.dept="CSE";
        Teacher t = new Teacher();
        t.name = "Mam"; 
        t.age = 35; 
        t.dept="CSE";
        HOD hod = new HOD();
        hod.name = "CSE_HOD";
        hod.age = 45;
        hod.dept="CSE";
        s.show();
        t.show();
        hod.show();
    }
}
