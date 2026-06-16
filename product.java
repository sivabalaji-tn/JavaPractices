import java.util.*;
class product{
    private int price;

    public void setprice(int price){
        this.price = price;
    }
    public int getprice(){
        if(price==0){
            System.out.println("not 0");
            return -1;
        }else if(price<0){
            System.out.println("Not negative");
            return -1;
        }else{
            System.out.print("Successfully set successfully to :");
            return price;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        product p = new product();
        int price = sc.nextInt();
        p.setprice(price);
        System.out.println(p.getprice());
    }
}