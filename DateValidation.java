import java.util.*;

public class DateValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "^(0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[0-2])\\.(\\d{4})$";
        String a = sc.nextLine();
        if(a.matches(regex)){
            System.out.println("valid date");
        }else{
            System.out.println("invalid date");
        }
    }
}