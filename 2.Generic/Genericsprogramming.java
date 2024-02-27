class BankAccount{
    public <T> void display(T val){
        System.out.println(val);
    }
}
class BankAccountCons<T>{
    T val;
    BankAccountCons(T val){
        this.val=val;
    }
    public T show(){
        System.out.println(val);
        return(val);
    }
}
public class Genericsprogramming {
    public static void main(String[] args) {
        BankAccount b1= new BankAccount();
        b1.display("Hello");
        b1.display(123);
        BankAccountCons<String> b2=new BankAccountCons<String>("Hello");
        String res=b2.show();
        System.out.println(res);
        BankAccountCons<Integer> b3= new BankAccountCons<Integer>(62);
        int res1=b3.show();
        System.out.println(res1);
        b3.show();
    }
}
