import java.util.*;
public class ClearBit {
    public static void main(String arg []){
         Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUM :  ");
        int num = sc.nextInt();
        System.out.print("ENTER POS :  ");
        int pos = sc.nextInt();
        int BitMask = 1<< pos;
        //int NotBit = ~(BitMask);
       //int newBit = num & NotBit;
        //System.out.println(newBit);

        int newBit = num & ~(BitMask);
        System.out.println(newBit);
    }
    
}
