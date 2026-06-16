import java.util.*;
class oopemployee {
    int base;
    int height;

    oopemployee(int base, int height) {
        this.base = base;
        this.height = height;
    }
    void display(){
        System.out.println((base*height)/2);
    }
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        oopemployee area = new oopemployee(base, height);
        area.display();
        sc.close();
    }
}