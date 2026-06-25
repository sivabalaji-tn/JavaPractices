import java.util.*;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

        if (password.matches(regex)) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}