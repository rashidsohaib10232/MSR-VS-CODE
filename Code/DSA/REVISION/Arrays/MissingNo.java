package REVISION.Arrays;

public class MissingNo {
    public static void main(String[] args) {
        int []arr = {1,2,4,5,6};
        int n = arr.length;

        int expectedSum = n*(n+1)/2;

        int actualSum = 0;

        for(int i =0; i<n; i++){
            actualSum += arr[i];
        }

        int ans=  actualSum-expectedSum;
        System.out.println(ans);
    }
}
