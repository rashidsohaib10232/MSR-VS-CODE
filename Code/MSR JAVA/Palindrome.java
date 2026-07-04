import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String s = sc.nextLine();

        int n = s.length();
        int i = 0, j = n-1;
        boolean isPalindrome = true;
        while (i<=j) {
            
            if(s.charAt(i) != s.charAt(j)){
                isPalindrome = false;
                break;
            }
            
            

            i++;
            j--;
            
            
        }
        if(isPalindrome==false){
            System.out.println("false");
        } else{
            System.out.println("true");
        }
        
        
        

    }
}
