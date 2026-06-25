import java.util.*;
public class Stacks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int a = sc.nextInt();
        for(int i=0; i<a; i++){
            st.push(sc.nextInt());
        }
        for(int i=0; i<3; i++){
            st.pop();
        }
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.search(10));
        for(int i=0; i<st.size(); i++){
            System.out.println("Total: "+st.get(i));
        }
    }
    
}
