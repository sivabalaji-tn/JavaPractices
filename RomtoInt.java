import java.util.*;

public class RomtoInt {

    static int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i < s.length() - 1) {
                String pair = s.substring(i, i + 2);

                if (pair.equals("IV")) {
                    result += 4;
                    i++;
                } else if (pair.equals("IX")) {
                    result += 9;
                    i++;
                } else if (pair.equals("XL")) {
                    result += 40;
                    i++;
                } else if (pair.equals("XC")) {
                    result += 90;
                    i++;
                } else if (pair.equals("CD")) {
                    result += 400;
                    i++;
                } else if (pair.equals("CM")) {
                    result += 900;
                    i++;
                } else {
                    result += value(s.charAt(i));
                }
            } else {
                result += value(s.charAt(i));
            }
        }

        System.out.println(result);
        sc.close();
    }
}