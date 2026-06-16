import java.util.*;
class employeerating{
    private int rating;
    private int increment;

    public void setemp(int rating, int increment){
        this.rating = rating;
        this.increment = increment;
    }
    public int getemp(){
        if(rating<3){
            System.out.println("not eligible for increment");
            return -1;
        }else{
            System.out.print("increment was added to salary about :");
            return increment;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        employeerating emp = new employeerating();
        int rating = sc.nextInt();
        int increment  = sc.nextInt();
        emp.setemp(rating, increment);
        System.out.println(emp.getemp());
    }
}