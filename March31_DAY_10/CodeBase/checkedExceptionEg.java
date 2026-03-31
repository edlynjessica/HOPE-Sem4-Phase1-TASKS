/*
Abstract class -> Tightly coupled

Interface -> Loosely coupled
(only the methods)

Concrete method consists of full implemetation

Access Modifiers:-

1. Public - all over the program
2. Private - within that class
3. Protected - within the subclasses
4. Default - all over program

TASK

1. utilize access modifiers (all)
extend 3 classes
2. getter setter program
3. 1 try with multiple catches  

Exception Handling and Error Management

Error Management - Making Syntaxial issues 

Exception Handling
-> Handling the runtime error
-> Handling the code with custom message
-> Running the program flawlessly without any troubles

Types:
1. Runtime
2. Compile Time
3. Creating ur own exception handling

what is meant by throwable?

Exceptions: checked, unchecked

Try, Catch, Finally
try{

}
catch(<Exception name> e){

}
*/

import java.util.*;

public class checkedExceptionEg{
    public static void main(String[] args) {
        /*
        try {
            int a=10/0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        */
        try {
            int[] arr={1,2,3,4};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
