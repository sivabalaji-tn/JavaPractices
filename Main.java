import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] b = a.split(" ");
        for(String word: b){
            if(word.matches("[a-zA-Z]+")){
                String rev = new StringBuilder(word).reverse().toString();
                System.out.print(rev+" ");
            }else{
                System.out.print(word+" ");
                sc.close();
            }
        }
    }
}


