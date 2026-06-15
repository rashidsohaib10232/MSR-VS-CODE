import java.util.*;

public class CAL {
    public static void main (String a []){
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        float l = num1 + num2;
        float s = num1 - num2;
        float m = num1 * num2;
        float d = num1 / num2;
        float mod = num1 % num2;

        System.out.println("Addition: " + l);
        System.out.println("Subtraction: " + s);
        System.out.println("Multiplication: " + m);
        System.out.println("Division: " + d);
        System.out.println("Modulus: " + mod);
    }
}
