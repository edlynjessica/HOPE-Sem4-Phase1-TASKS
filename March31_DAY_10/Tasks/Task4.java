public class Task4{
    public static void main(String[] args){
        try{
            int[] numbers={1,2,3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Specific Catch: Array index is out of bounds!");
        }
        catch(Exception e){
            System.out.println("General Catch: Some exception occurred.");
        }
    }
}

// OUTPUT: Specific Catch: Array index is out of bounds!
