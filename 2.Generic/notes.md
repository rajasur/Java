### Type Parameters
- *Parameter type cam be bounded by some range using extends keyword.*

#### Syntax:-
```java
class className<T extends A>{
    //methods and variables
}

class className<T extends A & B>{
    //methods and variables
}
```

Example:-

```java
class BankAccount<T extends Number>{
    //methods and variables
}

BankAccount<Integer> account = new BankAccount<Integer>();

BankAccount<String> current = new BankAccount<String>();//error
```

##### *Naming conventions for type parameters*
---
**T** - Type<br>
**E** - Element<br>
**K** - Key<br>
**N** - Number<br>
**V** - Value<br>

#### WildCards in Java Generics
---
- The Symbol used as Wildcard is ?
- ? represents any type

Example:-
```java
public static void deposite(AraayList<?> money){
    //codes.
}
```
### Upper bounded wildcards
Upper Bounded wildcards are used to restrict the upper bound of parameter type<br>
"? extends UpperBound_Class" represent Upper Bounded Wildcards

Example:-
```java
public statuc void deposite(ArrayList<? extends Number> money){
    //codes
}
``` 
### Lower bounded wildcard
Lower Bounded wildcards are used to restrict the unknown type to a specufuc parameter type<br>
"? super LowerBound_class" represents Lower Bunded wildcards

Example:-
```java
public statuc void deposite(ArrayList<? super Integer> money){
    //codes
}
```


