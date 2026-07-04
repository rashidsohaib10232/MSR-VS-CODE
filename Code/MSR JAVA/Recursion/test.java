package Recursion;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // ✅ Scanner object for input
        int n = sc.nextInt();                // ✅ Reads an integer
        print(n);                            // ✅ Call the recursive method
    }

    public static void print(int n) {
        if (n == 0) {
            return;                          // base case
        }
        System.out.print(n+" ");
        print(n -1); 
        //System.out.print(n + " ");           // print current number
        if(n!=1){
            System.out.print(n+" ");
        }                     
    }
}
