import java.util.*;
public class test1 {
    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        System.out.println("NO. OF ROW");
        int row = sc.nextInt();
        System.out.println("NO. COLUMNS ");
        int col = sc.nextInt();
        int [][] mtrix = new int[row][col];

        //input 
        System.out.println("ENTER THE ELEMENTS ");

        for(int i = 0; i<row ; i++){
            for(int j = 0; j<col; j++){
                mtrix[i][j] = sc.nextInt();
            }



        }
        //output

        System.out.println("MATRIX IS ");
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col ; j++){
                System.out.print(mtrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
