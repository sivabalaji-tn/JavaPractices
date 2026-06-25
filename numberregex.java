import java.util.*;

public class numberregex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = "[A-Za-z0-9+_.-]+@[A-Za-z0-9]+\\.[A-Za-z]{2,}$";

        if (a.matches(b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}