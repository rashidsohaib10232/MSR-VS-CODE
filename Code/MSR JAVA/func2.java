
import java.util.*;


public  class func2 {

    public static int calculate(int a , int b ) {

        int sum = a + b;
        return sum;
    }


    public static void main(String args []){

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUM : ");
        int a = sc.nextInt();
        System.out.println("ENTER SECOND NUM : ");
        int b = sc.nextInt();

        int sum = calculate(a, b);
        System.out.println("SUM OF TWO NUM " + a + " AND " + b + " IS :  " + sum);

        
    }

    

}
