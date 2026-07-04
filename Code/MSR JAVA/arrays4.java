import java.util.*;
public class arrays4 {
    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];

        //input
        for(int i =0; i<col; i++){
            for(int j = 0; j<row ; j++){

                matrix[i][j] = sc.nextInt();
            }
        }

        //output

        for(int i =0 ; i<row; i++){

            for(int j =0; j<col; j++){

                System.out.print(matrix[i][j] + " ") ;
                
            }

            System.out.println();
        }
    }
    
}
