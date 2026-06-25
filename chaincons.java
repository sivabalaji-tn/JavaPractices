class demo{
    demo(){
        this(5);
        System.out.print("No arguement");
    }
    demo(int x){
        this(5,20);
        System.err.println("1 arguement");
    }
    demo(int x, int y){
        System.out.println(x+y);
    }
}
public class chaincons{
    public static void main(String[] args) {
        demo d = new demo();
    }
}