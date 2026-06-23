import java.util.*;

class Cars {
    void print() {
        System.out.println("Cars");
    }

    class suv extends Cars {
        void print() {
            System.out.println("Mahindra XUV700");
        }
    }

    class Limo extends suv {
        void print() {
            System.out.println("BMW Li340");
        }
    }

    class sports extends Limo {
        void print() {
            System.out.println("BMW M3");
        }
    }
}

public class overringqn {
    public static void main(String[] args) {

        Cars c = new Cars();
        Cars.suv s = c.new suv();
        Cars.Limo l = c.new Limo();
        Cars.sports sp = c.new sports();

        c.print();
        s.print();
        l.print();
        sp.print();
    }
}