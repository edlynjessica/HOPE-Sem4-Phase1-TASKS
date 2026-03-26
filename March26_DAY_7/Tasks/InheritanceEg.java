class SJCE{
    void display(){
        System.out.println("There are multiple depts");
    }
}
class CSE extends SJCE{
    void dept(){
        System.out.println("Inside CSE Dept");
    }
}
public class InheritanceEg{
    public static void main(String[] args) {
        SJCE s=new SJCE();
        s.display();
        CSE c=new CSE();
        c.dept();
    }
}
