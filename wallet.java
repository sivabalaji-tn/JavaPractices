import java.util.*;
class wallet{
    private int balance;
    private int withdrawl;

    public void setwallet(int balance, int withdrawl){
        this.balance = balance;
        this.withdrawl = withdrawl;
    }

    public int getwallet(){
        if(withdrawl>balance){
            System.out.println("insufficient balance found");
            return -1;
        }else if(balance-withdrawl==0){
            System.out.println("Wallet balance should not be 0");
            return -1;
        }else{
            System.out.println("Withdrawl Successfully the wallet balance is:");
            return balance - withdrawl;
        }
    }
    public static void main(String[] args){
        wallet w = new wallet();
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int withdrawl = sc.nextInt();
        w.setwallet(balance, withdrawl);
        System.out.println(w.getwallet());
    }
}