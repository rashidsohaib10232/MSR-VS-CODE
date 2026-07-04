import java.util.*;
public class BitMask {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUM : ");
        int num = sc.nextInt();
        System.out.print("ENTER POS :  ");
        int pos = sc.nextInt();
        int bitMask = 1<< pos;
        if((num & bitMask) == 0){
            System.out.println("BIT IS OFF");
        }
        else{
            System.out.println("BIT IS ON");
        }
    }
}
