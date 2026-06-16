import java.util.Scanner;

public class phonenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        if (a.length() == 10 &&
            Character.isDigit(a.charAt(0)) &&
            (a.charAt(0) == '6' ||
             a.charAt(0) == '7' ||
             a.charAt(0) == '8' ||
             a.charAt(0) == '9')) {

            boolean b = true;

            for (int c = 0; c < a.length(); c++) {
                if (!Character.isDigit(a.charAt(c))) {
                    b = false;
                    break;
                }
            }

            if (b) {
                System.out.println("Valid Phone Number");
            } else {
                System.out.println("Invalid Phone Number");
            }

        } else {
            System.out.println("Invalid Phone Number");
        }
    }
}