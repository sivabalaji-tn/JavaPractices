import java.util.*;

class Truck {
    void display(String name) {
        System.out.println("Truck Name: " + name);
    }
}

class Engine extends Truck {
    void display(String name) {
        System.out.println("Engine Name: " + name);
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        Truck t = new Truck();
        Engine e = new Engine();

        t.display(name);
        e.display(name);
    }
}