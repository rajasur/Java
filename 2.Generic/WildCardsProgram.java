import java.util.ArrayList;
import java.util.List;

public class WildCardsProgram {
    public static void deleteBike(List<? extends Bike> l1, Bike b1) {
        l1.remove(b1);
        System.out.println("bike removed");
    }

    public static void addBike(List<? super Bullet> l2) {
        l2.add(new Bullet("classic"));
        System.out.println("bike added");
    }

    public static void printItems(List<?> list) {
        for (Object i : list) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        List<Vehicle> v1 = new ArrayList<>();
        List<Bullet> b1 = new ArrayList<>();
        addBike(v1);
        addBike(b1);
        printItems(v1);
        printItems(b1);
        Bullet bike1 = b1.get(0);
        deleteBike(b1, bike1);
    }
}

class Vehicle {
    String name;

    Vehicle(String name) {  // Corrected constructor
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Bike extends Vehicle {
    Bike(String name) {
        super(name);  // Corrected to call the parent constructor
    }
}

class Car extends Vehicle {
    Car(String name) {
        super(name);  // Corrected to call the parent constructor
    }
}

class Bullet extends Bike {
    Bullet(String name) {
        super(name);
    }
}
