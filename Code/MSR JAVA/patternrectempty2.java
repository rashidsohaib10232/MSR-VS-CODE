import java.util.*;

public class patternrectempty2 {

    public static void main (String a[]){

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();


        for(int i =1 ; i<= row; i ++){
            for(int j = 1 ; j <= col ; j ++){

                if(i == 1 || i == row || j ==col || j==1 ){

                    System.out.print("*");
                }else{

                    System.out.print(" ");


                }


                
            }


            System.out.println();
        }

    }
    
}
