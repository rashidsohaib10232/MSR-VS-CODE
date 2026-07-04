import java.util.*;
public class paternInverted {
    public
    static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
    
        
      //  System.out.print("n : ");
      //  int n = sc.nextInt();
      int n = 5;
    
        for(int i =0; i<=n; i++){
            for(int j=1; j<=n-1-i; j++){
              //  System.out.print("* "); // for right angle triangle with *
             //  System.out.print(j); // for 1234 123 12 1
             //  System.out.print(i); // for 00000 1111 222 33 4
             System.out.print((char)(j+64)+ " "); // for ABCD ABC

                
            }
    
            System.out.println();
        }

        sc.close();
    
}
}