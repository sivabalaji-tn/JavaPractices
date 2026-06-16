import java.util.*;
class seats{
    private int seat1;
    private int seat2;

    public void setseat(int seat1, int seat2){
        this.seat1 = seat1;
        this.seat2 = seat2;
    }

    public int getseat(){
        if(seat1==seat2){
            System.out.println("Once assigned cannot be modified");
            return -1;
        }else{
            System.out.println("Seat will be assigned ");
            return seat2;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        seats s = new seats();
        int seat1 = sc.nextInt();
        int seat2 = sc.nextInt();
        s.setseat(seat1, seat2);
        System.out.println(s.getseat());
        int res = s.getseat();
        if(res!=-1){
            System.out.println("Seats has been assigned as number of "+seat1+" and "+seat2);
        }
    }
}