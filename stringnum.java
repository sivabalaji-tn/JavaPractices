import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        boolean b = false;
        for(int i=0; i<a.length(); i++){
            if(Character.isDigit(a.charAt(i))){
                b = true;
            }
        }
        if(b){
            System.out.print("YES");
        }else{
            System.out.print("No");
        }
    }
}