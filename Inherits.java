import java.util.*;
class Person{
    String name;

    void getname(){
        Scanner sc =  new Scanner(System.in);
        name = sc.nextLine();
    }
}
class students extends Person{
    int marks;
    
    void getmarks(){
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
    }
    void display(){
        System.out.println("name : "+name);
        System.out.println("marks : "+marks);
    }
}
public class Inherits{
    public static void main(String[] args) {
        students j = new students();
        j.getname();
        j.getmarks();
        j.display();
    }
}


