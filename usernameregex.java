import java.util.*;

public class usernameregex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();

        String regex = "^[A-Za-z][A-Za-z0-9]{4,16}$";
        if (username.matches(regex)) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}