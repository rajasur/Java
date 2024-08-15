class BankAccount<T extends Number>{
    public void display(T[] t1){
        for(T i: t1){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

public class BoundedTypeParameter {
    public static void main(String[] args) {
        BankAccount<Number> b1 = new BankAccount<Number>();
        Integer[] m1 = {10,20,30,40};
        Double [] m2 = {10.2,20.5,54.52};
        b1.display(m1);
        b1.display(m2);
        //BankAccount<String> b2 = new BankAccount<String>(); // It will give you error because String not belongs from Number class.
    }
}
