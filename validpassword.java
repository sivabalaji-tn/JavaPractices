import java.util.*;
public class validpassword{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        boolean b = false; //low
        boolean c = false; //upp
        boolean d = false; //dig
        boolean e = false; //sym
        if(a.length()>=8){
        for(int i=0; i<a.length(); i++){
            char f = a.charAt(i);
            if(Character.isLowerCase(f)){
                b = true;
            }else if(Character.isUpperCase(f)){
                c = true;
            }else if(Character.isDigit(f)){
                d = true;
            }else{
                e = true;
            }
        }
        if(b&&c && d && e){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid password");
        }
    }
    else{
        System.out.println("Should be 8 characters");
    }
    sc.close();
}

}