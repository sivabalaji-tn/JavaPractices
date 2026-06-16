import java.util.*;

class Bank {
    private int balance;
    private int withdrawl;

    public void SetBW(int balance, int withdrawl) {
        this.balance = balance;
        this.withdrawl = withdrawl;
    }

    public int GetBalance() {
        if (withdrawl > balance) {
            System.out.println("invalid balance");
            return -1;
        } 
        else if (balance - withdrawl == 0) {
            System.out.println("Balance should not be 0");
            return -1;
        } 
        else {
            return balance - withdrawl;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();
        int balance = 10000;
        int withdrawl = sc.nextInt();
        b.SetBW(balance, withdrawl);
        int result = b.GetBalance();
        System.out.println("Remaining Balance: " + result);
    }
}