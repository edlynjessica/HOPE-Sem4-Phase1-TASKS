import java.util.*;

class Student implements Comparable<Student>{
    int rollno;
    String name;
    public Student(int rollno,String name) {
        this.rollno=rollno;
        this.name=name;
    }
    public int compareTo(Student s){
        return s.rollno-this.rollno; // descending order
    }
}
public class ComparableImp{
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(101,"John"));
        list.add(new Student(102,"Alice"));
        list.add(new Student(103,"Bob"));
        Collections.sort(list);
        //Collections.sort(list,Collections.reverseOrder());
        for(Student s:list){
            System.out.println(s.rollno+" "+s.name);
        }
    }
}

/*
Reverse engineer the code and tell me how the output is generated.

The code defines a `Student` class that implements the `Comparable` interface.
Each `Student` object has two attributes: `rollno` (an integer) and `name` (a string).
The `compareTo` method is overridden to compare `Student` objects based on their `rollno`.


SORT aphabetically...

Comparator is an interface in Java that allows you to define custom sorting logic for objects.
It provides a way to sort objects based on different criteria without modifying the original class.
  
*/
*/
