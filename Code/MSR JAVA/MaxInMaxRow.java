public class MaxInMaxRow {
    public static void main(String[] args) {
        int [][] arr = {{1,2,4},{0,4,2},{90,2,1}};
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
           
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j]; }
            }
        }
        System.out.println(max);
    }
}
