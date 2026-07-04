import java.util.*;
//Write a function to print the sum of all odd numbers from 1 to n.
public class hw2 {

    public static int oddnumbers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;   // FIX: add i, not 1
            }
        }

        return sum;  // FIX: moved outside loop
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int oddn = oddnumbers(n);
        System.out.println(oddn);
    }
}