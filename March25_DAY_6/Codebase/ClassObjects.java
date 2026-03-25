class Apartment{
    int n=1;
    public void display(){
        System.out.println("I'm inside apartment class");
    }

    public Apartment() {
        System.out.println("Inside Default Constructor, apartment type: "+n);
    }
    public Apartment(int n){
        this.n=n;
        System.out.println(n+"BHK");
    }
    
}
public class ClassObjects{
    public static void main(String[] args) {
        System.out.println("I'm inside class objects");
        Apartment ap=new Apartment();
        ap.display();
        Apartment ap2=new Apartment(3);
    }
}
