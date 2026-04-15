## ITERATOR

Iterator means traversing the given collection

We utilize the iterator mostly in collections

- To traverse efficiently we are going for iterator
```
Iterator <T> it = new Iterator();
```
<T> -> Generic Type

- It has 3 functions
1. hasnext()
2. next()
3. remove()

## COMPARABLE INTERFACE

- mainly used to compare the given generic type
```
public interface Comparable <T>{
    public int compareTo (int a,int b);
}
```
inbuilt comparison happens automatically
