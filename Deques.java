import java.util.*;
public class Deques{
    public static void main(String[] agrs){
        Deque<Integer> dq = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<a; i++){
            dq.offer(sc.nextInt());
        }
        dq.offer(90);
        
    }
}