import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> s = new LinkedList<String>();
        int a = sc.nextInt();
        for(int i=0;i<a; i++){
            s.add(sc.nextInt());
        }

        System.out.println(s);
    }
}