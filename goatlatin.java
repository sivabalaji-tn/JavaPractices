import java.util.*;

public class goatlatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String[] b = a.split(" ");
        String d = "aeiouAEIOU";

        StringBuilder c = new StringBuilder();

        for (int i = 0; i < b.length; i++) {

            if (d.contains("" + b[i].charAt(0))) {
                c.append(b[i]).append("ma");
            } else {
                c.append(b[i].substring(1))
                 .append(b[i].charAt(0))
                 .append("ma");
            }

            for (int j = 0; j <= i; j++) {
                c.append("a");
            }

            c.append(" ");
        }

        System.out.println(c.toString().trim());
        sc.close();
    }
}