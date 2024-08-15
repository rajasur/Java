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
**V** - Value

