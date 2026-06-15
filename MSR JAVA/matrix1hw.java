import java.util.*;

public class matrix1hw {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ROW   : ");
        int row = sc.nextInt();

        System.out.println("COL      :");
        int col = sc.nextInt();

        int [][] element = new int[row][col];

        // Input
        System.out.println("Enter the elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                element[i][j] = sc.nextInt();  // ✅ Correct way
            }
        }

        // Output
        System.out.println("OUTPUT:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(element[i][j] + " "); // ✅ print in same line
            }
            System.out.println(); // move to next row
        }



        //searching 
        System.out.println("FOR SEARCHING ELEMENT  ");
        int x = sc.nextInt();
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                //compare 
                if(element[i][j]==x){
                    System.out.println("x found at location "+ i+ " , " + j );
                }
            }
        }
    }
}