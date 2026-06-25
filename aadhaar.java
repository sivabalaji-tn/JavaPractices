import java.util.*;
public class aadhaar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        String b = "^[0-9]{12}$";

        if (a.matches(b)) {
            System.out.println("Valid Aadhaar");
        } else {
            System.out.println("Not a valid Aadhaar");
        }
    }
}


