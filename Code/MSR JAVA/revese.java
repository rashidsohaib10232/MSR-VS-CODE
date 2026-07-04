import java.util.*;

public class revese {
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.next();
        String rev = " ";

        
        for(int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
            rev = rev + str.charAt(i);
        }

        //checking for palindrome
        if(str.equals(rev)){
            System.out.println(" - palindrome");
        }
        else{
            System.out.println(" - not palindrome");
        }


    

}
}