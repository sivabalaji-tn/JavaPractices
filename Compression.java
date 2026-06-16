import java.util.*;

public class Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count = 1;

        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                count++;
            } else {
                System.out.print(a.charAt(i - 1) + "" + count);
                count = 1;
            }
        }
        System.out.print(a.charAt(a.length() - 1) + "" + count);
        sc.close();
    }
}