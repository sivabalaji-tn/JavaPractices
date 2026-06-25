import java.util.*;
public class removearray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> as = new ArrayList<>();
        for(int i=0; i<a; i++){
            as.add(sc.nextInt());
        }
        as.remove(Integer.valueOf(20));
        System.out.println(as);
        System.out.println(as.indexOf(30));
       }    
}
