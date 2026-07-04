public class ColWIsePrint {
    public static void main(String[] args) {
         int [][] arr = {{1,2,4},{0,4,2},{90,2,1}};
         for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
         }
    }
}
