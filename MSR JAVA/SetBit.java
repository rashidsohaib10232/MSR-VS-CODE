
import java.util.Scanner;

public class SetBit {
    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUM :  ");
        int num = sc.nextInt();
        System.out.print("ENTER POS :  ");
        int pos = sc.nextInt();
        int BitMask = 1<< pos;
        int newBitMask = num | BitMask;
        System.out.println(newBitMask);
    }
    
}
