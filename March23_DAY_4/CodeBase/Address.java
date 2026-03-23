public class Address{
    public static void main(String[] args) {
        Integer[] arr1={1,2,3};
        System.out.println(arr1);
        System.out.println(arr1);
        System.out.println(arr1[0].hashCode()==1);
        Double[] arr2=new Double[]{};
        System.out.println(arr2);
        String[] arr3={"Hello","World"};
        System.out.println(arr3);
        System.out.println(arr3.hashCode());
        boolean[] arr5={true,false,true};
        System.out.println(arr5);
        System.out.println(Integer.toHexString(arr5.hashCode()));
    }
}
