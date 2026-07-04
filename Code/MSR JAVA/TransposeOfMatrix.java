public class TransposeOfMatrix {
    public static void main(String[] args) {
int [][] arr = {{1,2,4,5,6},{7,8,9,10,11},{90,2,1,12,13},{14,15,16,17,18},{19,20,21,22,23}};

        int n = arr.length;

        for(int i =1; i<n; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }
        for(int i =0; i<n; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
