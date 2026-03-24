//TASK 1 Types of Methods

class Methods{
    // Parameterized Method (no return type)
    static void add(int a,int b){
        System.out.println("Add: "+(a + b));
    }
    // (with return type)
    static int multiply(int a,int b){
        return a * b;
    }
    // Multiple parameters
    static void display(String name,int age){
        System.out.println("Name & Age: "+name+" "+age);
    }
    public static void main(String[] args) {
        add(10, 20);
        int m = multiply(5, 4);
        System.out.println("Multiplication Answer: " + m);
        display("Ed", 25);
    }
}
