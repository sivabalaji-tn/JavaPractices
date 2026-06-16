import java.util.*;

class prime {
    int a;

    prime() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
    }
    void display(){
        boolean prime = true;
        if(a<=1){
            prime = false;
        }else{
            for(int i=2; i<a/2; i++){
                if(a%i==0){
                    prime = false;
                    break;
                }
            }
        }
        if(prime){
            System.out.print("Prime");
        }else{
            System.out.print("Not Prime");
        }
    }
    public static void main(String[] args){
        prime obj = new prime();
        obj.display();
    }
}