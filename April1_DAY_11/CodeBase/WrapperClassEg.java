/*
wrapper -> wraps
class -> blueprint

to convert primitive data types we are in need of wrapper classes

primitive data types    objects (wrapper classes)

    int                     Integer
    float                   Float
    double                  Double
    boolean                 Boolean
    byte                    Byte
    char                    Character

Primitive data type :- 

*/

public class WrapperClassEg{
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        Integer objA=10;
        System.out.println(a);
        System.out.println(a==objA);
        System.out.println(objA.hashCode());
    }
}

// we cant see hashcode of "a" because its a primitive data type

/*
AutoBoxing and UnBoxing

functions inside wrapper class

*/
