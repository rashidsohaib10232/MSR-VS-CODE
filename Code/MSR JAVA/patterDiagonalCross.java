import java.util.*;
public class patterDiagonalCross {
    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        System.out.print("row : ");
        int row = sc.nextInt();
        System.out.print("col : ");
        int col = sc.nextInt();
        for(int i =0; i<=row; i++){
            for(int j=0; j<=col; j++){
                if(i == (row+1)/2 || j == (col+1)/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
