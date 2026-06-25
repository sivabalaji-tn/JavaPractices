import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sb = new ArrayList<>();
        ArrayList<String> ss = new ArrayList<>();
        int a = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<a; i++){
            sb.add(sc.nextLine());
        }
        ss.addAll(sb);
        System.out.println(sb);
        System.out.println(ss);
    }
}