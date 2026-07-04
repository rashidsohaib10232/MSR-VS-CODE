public class target {
    public static void main(String[] args) {
        int[] arr = {-2, 34, 23, 2, 2, 34, 55, 56, 4};
        int target = 2;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                flag = true;
                break;  
            }
        }

        if (flag == true) {
            System.out.print("present");
        } else {
            System.out.print("absence");
        }
    }
}