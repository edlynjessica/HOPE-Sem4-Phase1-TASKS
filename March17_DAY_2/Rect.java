import java.util.*;

public class Rect{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("a: ");
        int a=sc.nextInt();
        System.out.print("b: ");
        int b=sc.nextInt();
        System.out.println("perimeter = "+(2*(a+b)));
        System.out.println("Area = "+(a*b));
    }
}
