import java.util.*;
public class invertpatt4{

    public static void main (String a []){

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        //outer loop
        for(int i = p; i >=1; i--) {
            //inner loop
            for(int j = 1; j<=i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        
        
    }
}