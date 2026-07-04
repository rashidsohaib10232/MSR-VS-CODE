public class SnakePrinting {
    public static void main(String[] args) {
        int [][] arr = {{1,2,4},{0,4,2},{90,2,1}};
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                // left to right
                for(int j = 0; j < arr[0].length; j++){
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // right to left
                for(int j = arr[0].length - 1; j >= 0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println(); // next row
        }
    }
}
