class Student{
    String name;
    int rollno;
    public Student(String name, int rollno) {
        this.name=name;
        this.rollno=rollno;
    }
    void display(){
        System.out.println("Name: "+name+"\nRollNo: "+rollno);
    }
}

public class ThisKeywordEg{
    public static void main(String[] args) {
        Student s1=new Student("Edlyn", 4077);
        s1.display();
        System.out.println(s1.hashCode());
        Student s2=new Student("Joanna", 4128);
        s2.display();
        System.out.println(s2.hashCode());
        Student s3=new Student("Singh",4116);
        s3.display();
        System.out.println(s3.hashCode());
    }
}
