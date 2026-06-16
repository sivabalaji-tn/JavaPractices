import java.util.*;

class ageauth {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        if (age <= 0) {
            System.out.println("Invalid age");
            return -1;
        } else {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ageauth b = new ageauth();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        b.setAge(age);

        int result = b.getAge();

        if (result != -1) {
            System.out.println("Age: " + result);
        }
    }
}