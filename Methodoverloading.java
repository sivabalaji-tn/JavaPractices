import java.util.*;
class Students{
    void display(String name){
        System.out.println("Name: "+name);
    }
    void display(String name, int age){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    void display(int fees){
        System.out.println("Fees: "+fees);
    }
}
public class Methodoverloading{
    public static void main(String[] args){
        Students a = new Students();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        int fees = sc.nextInt();
        a.display(name, age);
        a.display(fees);

    }
}