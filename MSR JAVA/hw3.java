//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;
public class hw3 {

    public static int greaternum(int a , int b ){

        if( a<b){
            System.out.println(b + " IS GREATER THAN "+ a );
            return b;
        }

        else if (a>b) {
            System.out.println(a + " IS GREATER THAN "+ b );
            return a;
        }

        else {
            System.out.println(a + " AND "+ b + " BOTH ARE EQUAL ");

            return a;
        }
        
    
        
    }


    public static void main(String arg []){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = greaternum(a, b);
        System.out.println(result);
    }
    
}
