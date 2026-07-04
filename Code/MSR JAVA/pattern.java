import java.util.*;

public class pattern {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ROW : ");
        int row = sc.nextInt();
        System.out.print("ENTER COL : ");
        int col = sc.nextInt();
       // System.out.print("n : ");
      //  int n = sc.nextInt();


      for(int i = 0; i<=row; i++){
            for(int j =0; j<=col; j++){
               // System.out.print("* ");           // for ****** ******* ******* rect 
               //System.out.print(j); //012345
               //System.out.print(i); //000000    //111111  2222222 33333
              // System.out.print((char)(j+65)+ " "); // ABCDE ABCDE ABCDE 
              // System.out.print((char)(i+65)+ " ");  // A A A A A A A         B B B B B B B           C C C C C C C 
              


               
                                   
            }
            System.out.println();
        }

    }
}