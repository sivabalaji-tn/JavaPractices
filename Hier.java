class Bikes {
    int topspeed = 180;
}

class KTM extends Bikes {
    int topspeed = 160;

    void display() {
        System.out.println("KTM Top Speed: " + super.topspeed);
    }
}

class Yamaha extends Bikes {
    int topspeed = 150;

    void display() {
        System.out.println("Yamaha Top Speed: " + super.topspeed);
    }
}

public class Hier {
    public static void main(String[] args) {
        KTM bike1 = new KTM();
        Yamaha bike2 = new Yamaha();

        bike1.display();
        bike2.display();
    }
}