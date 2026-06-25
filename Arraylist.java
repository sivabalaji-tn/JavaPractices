import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> as = new ArrayList<>();
        for(int i=0; i<a; i+=i+1){
            as.add(i);
        }
        for(int i=0; i<as.size(); i++){
            System.out.print(as.get(i)+" ");
        }
    }
}// remove partcular value from the list