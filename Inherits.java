import java.util.*;

class Person{
    String name;

    void getname(){
        Scanner sc = new Scanner(System.in);
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
        System.out.println("name : " + name);
        System.out.println("marks : " + marks);
    }
}

class c extends students{

    void getresult(){
        if(marks >= 50){
            System.out.println("You have passed the exam");
        }else{
            System.out.println("Sorry, better luck next time");
        }
    }
}

public class Inherits{
    public static void main(String[] args) {
        c j = new c();

        j.getname();
        j.getmarks();
        j.display();
        j.getresult();
    }
}