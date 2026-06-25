import java.util.*;

public class LargestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] b = a.split(" ");
        String largest = b[0];

        for (int i = 1; i < b.length; i++) {
            if (b[i].length() > largest.length()) {
                largest = b[i];
            }
        }

        System.out.println(largest);
    }
}