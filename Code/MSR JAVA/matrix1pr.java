import java.util.*;

public class matrix1pr {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int [][] matrix = new int[row][col];

        // Input
        System.out.println("Enter the elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();  
            }
        }

        // Output
        System.out.println("Matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // move to next row
        }
    }
}