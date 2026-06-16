import java.util.Scanner;

public class longestsubs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            boolean arr[] = new boolean[256];
            int count = 0;

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                if (arr[ch]) {
                    break;
                }

                arr[ch] = true;
                count++;

                if (count > max) {
                    max = count;
                }
            }
        }

        System.out.println(max);
    }
}
