import java.util.*;

class Employee {
    String name;

    void getname() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    }
}

class Salary extends Employee {
    double salary;

    void getsalary() {
        Scanner sc = new Scanner(System.in);
        salary = sc.nextDouble();
    }
}

class Hike extends Salary {
    int hikegrade;

    void gethike() {
        Scanner sc = new Scanner(System.in);
        hikegrade = sc.nextInt();
    }
}

class Eligibility extends Hike {
    void eligible() {
        if (hikegrade >= 5) {
            System.out.println("Eligible for Salary Hike");
        } else {
            System.out.println("Not Eligible for Salary Hike");
        }
    }
}

public class Hierarchical {
    public static void main(String[] args) {

        Eligibility a = new Eligibility();

        a.getname();
        a.getsalary();
        a.gethike();
        a.eligible();
    }
}