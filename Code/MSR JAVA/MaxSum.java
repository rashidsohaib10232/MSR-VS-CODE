public class MaxSum {
    public static void main(String[] args) {
        int [][] arr = {{1,2,4},{0,4,2},{90,2,1}};
        int MaxSum = Integer.MIN_VALUE;
        int row = -1;

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[0].length; j++){
                sum += arr[i][j];
            }

            // Check and update together
            if(sum > MaxSum){
                MaxSum = sum;
                row = i;
            }
        }

        System.out.println("Maximum Row Sum: " + MaxSum);
        System.out.println("Row Index: " + row);
    }
}
