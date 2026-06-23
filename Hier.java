class Bikes {
    int topspeed = 180;
}
class KTM extends Bikes {
    void display() {
        System.out.println("KTM Top Speed: " + super.topspeed);
    }
}

class Yamaha extends Bikes {
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