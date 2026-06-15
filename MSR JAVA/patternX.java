import java.util.*;
public class patternX {
    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        System.out.print("row : ");
        int row = sc.nextInt();
        System.out.print("col : ");
        int col = sc.nextInt();
        for(int i =1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i == j || j == (col-i+1)){
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
