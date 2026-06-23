import java.util.*;

class Vehicle {
    String name;

    void getname() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Vehicle Name: " + name);
    }
}

class Cars extends Vehicle {
    String carname;

    void getcar() {
        Scanner sc = new Scanner(System.in);
        carname = sc.nextLine();
        System.out.println("Car Name: " + carname);
    }
}

class Bike extends Vehicle {
    String bikename;

    void getbike() {
        Scanner sc = new Scanner(System.in);
        bikename = sc.nextLine();
        System.out.println("Bike Name: " + bikename);
    }
}

public class hierarchyvehicle {
    public static void main(String[] args) {

        Cars c = new Cars();
        Bike b = new Bike();

        c.getname();
        c.getcar();

        b.getname();
        b.getbike();
    }
}