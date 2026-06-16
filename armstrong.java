import java.util.*;

class Armstrong {
    int a;

    Armstrong() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
    }

    void display() {
        int temp = a;
        int sum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + rem * rem * rem;
            temp = temp / 10;
        }

        if (sum == a)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }

    public static void main(String[] args) {
        Armstrong obj = new Armstrong();
        obj.display();
    }
}