// ABSTRACTION - hiding implementation details
/*

Abstract class can hold both abstract and concrete methods
Differentiate a concrete method and an abstract method - Interview q

*/


abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("Eating");
    }
}


// CONCRETE CLASS
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Animal a=new Cat();
        a.eat();
        a.sound();
    }
}

