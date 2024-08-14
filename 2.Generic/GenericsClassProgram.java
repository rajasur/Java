// Java Generics class program with parameterized constructor.
class BankAccount<T>{
    T t1;
    BankAccount(T t1){
        this.t1 = t1;
    }
    public void display(){
        System.out.println(t1);
    }

    //Java Generics method.
    public <T> void depositeMoney(T[] money){
        for(T m: money){
            System.out.print(m+" ");
        }
        System.out.println();
    }
}

// Java main class to test the above generic class.
public class GenericsClassProgram{
    public static void main(String args[]){
        BankAccount<String> b1 = new BankAccount<>("HDFC");
        BankAccount<Integer> b2= new BankAccount<>(123456);
        b1.display();
        b2.display();

        Integer[] m1 = {100,200,300,400,500};
        Double[] m2 = {20.45, 67.89, 45.67, 89.45};
        b1.depositeMoney(m1);
        b2.depositeMoney(m2);
    }
}