import java.util.*;

class avgofn {
    int result;

    void display() {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int given = sc.nextInt();
        int[] arr = new int[given];
        int sum = 0;
        for (int i = 0; i < given; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        avgofn obj = new avgofn();
        obj.result = sum / given;
        obj.display();
    }
}