package Recursion;
import java.util.*;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();              // read input
        int result = fact(n);              // call recursive method
        System.out.println(result);        // print factorial
    }

    // Recursive factorial method
    public static int fact(int n) {
        if (n == 0 || n == 1) {            // base case
            return 1;
        }
        return n * fact(n - 1);            // recursive step
    }
}
