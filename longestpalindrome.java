import java.util.Scanner;

public class longestpalindrome {

    static boolean palindrome(String s) {
        int a = 0;
        int b = s.length() - 1;

        while (a < b) {
            if (s.charAt(a) != s.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String ans = "";

        for (int a = 0; a < s.length(); a++) {
            for (int b = a; b < s.length(); b++) {

                String sub = s.substring(a, b + 1);

                if (palindrome(sub) && sub.length() > ans.length()) {
                    ans = sub;
                }
            }
        }

        System.out.println(ans);
    }
}
