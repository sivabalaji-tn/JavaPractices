import java.util.*;
public class findlarge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int []b = new int [a];
        int d = b[0];
        for(int i=0; i<a; i++){
            b[i] = sc.nextInt();
        }
        for(int i=0; i<b.length; i++){
            if(b[i]>d){
                d=b[i];
            }
        }
        sc.close();
        System.out.println(d);
    }
}