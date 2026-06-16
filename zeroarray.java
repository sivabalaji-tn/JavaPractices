import java.util.*;
public class zeroarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int left = 0; 
        int right = 0;
        int[]b = new int[a];
        for(int i=0; i<a; i++){
            b[i] = sc.nextInt();
        }
        while(right<a){
            if(b[right]!=0){
                int d = b[left];
                b[left] = b[right];
                b[right] = d;
                left++;
            }
            right++;
        }
        for(int i=0; i<a; i++){
        System.out.print(b[i]+" ");
    }
        sc.close();
    }
    
}