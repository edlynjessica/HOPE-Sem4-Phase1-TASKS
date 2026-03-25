import java.util.*;

public class StringBuilderMethods{
  public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");
        // 1. append()
        sb.append(" World");
        System.out.println("append: " +sb);

        // 2. insert()
        sb.insert(5," Java");
        System.out.println("insert: " +sb);

        // 3. replace()
        sb.replace(6,10,"Python");
        System.out.println("replace: " +sb);

        // 4. delete()
        sb.delete(6, 10);
        System.out.println("delete: " +sb);

        // 5. deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt: " +sb);

        // 6. reverse()
        sb.reverse();
        System.out.println("reverse: " +sb);

        // 7. reverse back (for further operations)
        sb.reverse();

        // 8. length()
        System.out.println("length: " + sb.length());

        // 9. capacity()
        System.out.println("capacity: " + sb.capacity());

        // 10. charAt()
        System.out.println("charAt(1): " + sb.charAt(1));

        // 11. setCharAt()
        sb.setCharAt(0, 'Y');
        System.out.println("setCharAt: " + sb);

        // 12. substring()
        System.out.println("substring(0,5): " + sb.substring(0, 5));

        // 13. toString()
        String str = sb.toString();
        System.out.println("toString: " + str);
    
        // 14. indexOf()
        System.out.println("indexOf 'l': " + sb.indexOf("l"));
  }
}
