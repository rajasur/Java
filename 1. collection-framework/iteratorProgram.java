import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class iteratorprogram{
    public static void main(String[] args) {
        List l= new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        System.out.println(l); // Print ArrayList object
        Iterator itr=l.iterator(); //Use Iterator cursor for printing ArrayList items
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("ListIterator print using hasNext() & next()");
        ListIterator litr=l.listIterator();
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("ListIterator print using hasPrevious() & previous()");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
        /* Cursor reached out to 1st position, and set the value in the 1st place using ListIterator set method */
        litr.set(200);
        System.out.println(l);
        /* remove the elment from ArrayLisy using ListInterator remove method */
        litr.remove();
        System.out.println(l);
    }
}