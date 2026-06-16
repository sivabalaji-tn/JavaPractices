import java.util.*;

public class pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();

        boolean pangram = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!a.contains("" + ch)) {
                pangram = false;
                break;
            }
        }

        if (pangram) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a Pangram");
            sc.close();
        }
    }
}