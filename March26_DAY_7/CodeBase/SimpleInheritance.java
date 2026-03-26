/*

INHERITANCE
-> Parent - Child Relationship
-> Using "this" keyword
-> Using "super" keyword
-> IS-A relationship

Parent class | Child class ||  relate with genes / genetics

What is Inheritance?
-> Properties/Behaviour that's been transferred from parent class to child class is called Inheritance
-> Child class uses the features of parent class is called Inheritance
 

child class will be called but parent class file will be generated first, 
then only child class gets generated

Parent                p     =    new Child()
<class loader>     <stack>     <heap memory> (reference -> address)

*/

class Parent{
    int x=10;
    void display(){
        System.out.println("I'm inside Parent class and value of x: "+x);
    }
}
class Child extends Parent{
    void display1(){
        System.out.println("I'm inside Child class");
    }
}
public class SimpleInheritance{
    public static void main(String[] args) {
        System.out.println("I'm inside Main class");
        Child c=new Child();
        c.display();
        c.display1();
        Parent p=new Parent();
        p.display();

       /* 
       Parent c=new Child();
       c.display1(); // ERROR !! cause only PARENT CLASS is LOADED in the class loader
       
       and the reference type is created for CHILD CLASS.. so you cant call the child's method
       */


    }
}

