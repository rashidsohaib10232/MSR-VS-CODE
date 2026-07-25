public class decInc {
    public static void main(String[] args) {
        int n = 5;
        DecInc(n);
    }

    public static int DecInc(int n) {
        if (n <= 0) {
            return 0;
        }

        System.out.println(n);
        return DecInc(n - 1);

        
    }
}