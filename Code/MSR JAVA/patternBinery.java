import java.util.*;
public class patternBinery {
    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        for(int i =0; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
