// Problem 1: Print numbers from n to 1 recursively.
public class Problem1 {
    public static void main(String[] args) {
        int n = 3;
        printnum(n);
    }

    public static void printnum(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printnum(n - 1);


        // printnum(n-1);
        System.out.println(n);
        
        
    }
}
