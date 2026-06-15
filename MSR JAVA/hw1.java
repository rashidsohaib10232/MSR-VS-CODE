
import java.util.*;

//Enter 3 numbers from the user & make a function to print their average.


public class hw1 {

    public static int avg(int a , int b , int c){

        int avg = (a+b+c)/3;

        return avg;
    }

    public static void main(String arg []){

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int av = avg(num1, num2, num3);
        System.out.println(av);
    }
    
}
