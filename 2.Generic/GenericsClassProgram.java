// Java Generics class program with parameterized constructor.
class BankAccount<T>{
    T t1;
    BankAccount(T t1){
        this.t1 = t1;
    }
    public void display(){
        System.out.println(t1);
    }
}

// Java main class to test the above generic class.
public class GenericsClassProgram{
    public static void main(String args[]){
        BankAccount<String> b1 = new BankAccount<>("HDFC");
        BankAccount<Integer> b2= new BankAccount<>(123456);
        b1.display();
        b2.display();
    }
}