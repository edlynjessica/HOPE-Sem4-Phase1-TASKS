
class Animal{
    void display(){
        System.out.println("There are multiple animals");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog{
    void weeps(){
        System.out.println("Puppy weeps");
    }
}
public class Inheritance{
    public static void main(String[] args) {
        Dog sound=new Dog();
        sound.bark();
        sound.display();
        System.out.println(sound.hashCode());  // hashcode -> numerical value
        Puppy pup=new Puppy();
        pup.weeps();
    }
}


/*
Types of Inheritance
1. Single
2. MultiLevel
3. Hierarchial
4. Multiple 
5. Hybrid 

4 & 5 -> NOT SUPPORTED by java directly..
multiple inheritance -> supported by java indirectly in the form of "Interface"

*/
