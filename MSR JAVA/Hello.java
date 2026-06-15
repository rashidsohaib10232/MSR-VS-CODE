import java.util.*;

public class Hello {
    public static void main(String args[]) {
        // Prints to the error stream (usually appears red in consoles)
        System.err.println("HELLO JAVA");
        
        // Printing a simple pattern
        System.out.println("@");
        System.out.println("@@");
        System.out.println("@@@");
        System.out.println("@@@@");

        // Math operations
        int c = 35;
        int b = 32;
        int sum = c + b;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + (c * b));

        // Taking User Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        
        // Note: sc.next() only takes the first word. 
        // Use sc.nextLine() if you want the full name!
        String name = sc.nextLine(); 
        System.out.println("Hello, " + name);
        
        sc.close(); // Good practice to close the scanner
    }
}
