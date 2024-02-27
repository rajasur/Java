import java.util.ArrayList;

public class ArrayListProgram {
    public static void main(String args[]){
        // import three different types of ArrayList Constructor
        ArrayList al=new ArrayList(); // byDefault it will create initialCapacity: 10 & Size=0
        ArrayList al1=new ArrayList(6);
        ArrayList al2=new ArrayList(al1);// pass collection object to Array List constructor

        // Different types of Array List methods
        al.add(10);
        al.add("Raja S2");
        al.add("SAP");
        System.out.println(al);

        ArrayList al3=new ArrayList();
        al3.add(98);
        al3.add("Rahul");
        al3.add("MG");
        al.addAll(al3); // It will add all al3 collection element into al1 collection object
        System.out.println(al3);
        System.out.println(al);
        System.out.println(al.contains("SAP"));//it will check whether the object is present or not in the array list
        System.out.println("ArrayList Size is: "+al.size()); // It will check the size of an ArrayList
        al.set(1,"Raja");// It will set the value at index position 1
        System.out.println(al);
        System.out.println(al.get(4));// It will fetch the value from index position 4
        System.out.println("Index value of Rahul(Object): "+al.indexOf("Rahul"));// it will return the index value of an object
        al.remove(3); // It will remove the value based upon index value
        System.out.println(al);
        al.remove("Rahul"); // It will remove the value based upon object
        System.out.println(al);
    }
}