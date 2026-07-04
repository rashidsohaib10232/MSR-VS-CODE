import java.util.*;
public class UpdateBit {
     public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUM :  ");
        int num = sc.nextInt();
        System.out.print("ENTER POS :  ");
        int pos = sc.nextInt();
        int BitMask = 1<< pos;
        System.out.print("ENTER 0 OR 1 : ");
        int c = sc.nextInt();
        if(c == 1){
            int newBitMask = num| BitMask;
            System.out.println(newBitMask);
        } else { //clear
            int newBit = num & ~(BitMask);
            System.out.println(newBit);
        }
    
}
}