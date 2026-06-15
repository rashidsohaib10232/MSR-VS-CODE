import java.util.*;
public class pattern1solidrect {
    public static void main(String a []){


        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int r = sc.nextInt();

        String p = " ";
        for(int i = 1; i<= c; i++ ){

            

            for(int j = 1; j <=r ; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
