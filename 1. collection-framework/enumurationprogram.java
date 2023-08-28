import java.util.Vector;
import java.util.Enumeration;
class enumurationprogram{
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(10);
        v.add("Raja");
        v.add("abc123");

        // Vector object print
        System.out.println(v);

        // Using Enumeration cursor to print elments of legacy class
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}