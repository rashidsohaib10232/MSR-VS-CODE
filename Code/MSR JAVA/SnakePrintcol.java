public class SnakePrintcol {
    public static void main(String[] args) {
        int [][] arr = {{1,2,4},{0,4,2},{90,2,1}};
        int rows = arr.length;
        int cols = arr[0].length;

        for(int j = 0; j < cols; j++){
            if(j % 2 == 0){
                // top to bottom
                for(int i = 0; i < rows; i++){
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // bottom to top
                for(int i = rows - 1; i >= 0; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println(); // next column
        }
    }
}
