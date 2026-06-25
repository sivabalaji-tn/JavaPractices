class Person {
    String name = "Hello from Parent class";

    Person() {
        System.out.println(name);
    }
}

class Student extends Person {
    String name = "Sub Class";

    Student() {
        super(); 
        System.out.println(name);
    }
}

public class supercon {
    public static void main(String[] args) {
        Student s = new Student();
    }
}