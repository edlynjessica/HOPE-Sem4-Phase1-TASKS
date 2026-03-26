class Father{
    void display(){
        System.out.println("I'm the father");
    }
}
class Son extends Father{
    void job(){
        System.out.println("Since u r going to job, im gonna hand over this business to ur sister");
    }
}
class Daughter extends Father{
    void business(){
        System.out.println("Since i have my own business I dont have proper time to manage yours");
    }
}
public class HierarchialInheritance{
    public static void main(String[] args) {
        Father f=new Father();
        f.display();
        Son s=new Son();
        s.job();
        Daughter d=new Daughter();
        d.business();
    }
}
