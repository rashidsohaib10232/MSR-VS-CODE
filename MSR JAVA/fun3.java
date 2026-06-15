import java.util.*;

public class fun3 {

    public static int Mult(int a , int b ) {


        int mult = a*b;
        return mult;

    }


    public static void main(String arg []){

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUM : ");
        int a = sc.nextInt();
        System.out.println("ENTER SECOND NUM : ");
        int b = sc.nextInt();

        int mult = Mult(a, b);
        System.out.println("MULT OF TWO NUM " + a + " AND " + b + " IS :  " + mult);
    }


    
}
