class BankAcc{
    public <T> void depositeMoney(T[] money){
        for(T m: money){
            System.out.print(m+" ");
        }
        System.out.println();
    }
}

class GenericMethod{
    public static void main(String args[]){
        BankAcc b1 = new BankAcc();
        Integer[] m1 = {1,2,9,5,3};
        Double[] m2 = {42.5,92.3,99.35};

        b1.depositeMoney(m1);
        b1.depositeMoney(m2);

    }
}
