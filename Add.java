import java.util.*;
class Add{
    Add(String name){
        System.out.println("Only name "+name);
    }
    Add(String name, int age){
        System.out.println("Name with age: "+name+" "+age);
    }
    Add(String name, int age, int id){
        System.out.println("Name with age and ID "+name+" "+age+" "+id);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age  = sc.nextInt();
        int id = sc.nextInt();

        overloading obj1 = new overloading(name);
        overloading obj2 = new overloading(name, age);
        overloading obj3 = new overloading(name, age, id);
    }

}