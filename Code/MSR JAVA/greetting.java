import java.util.*;

public class greetting {
    public static void main (String a []){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

/* 
        if(k == 1) {
            System.out.println("ASSALAM-O-ALLEKUM");
           
            
        }
        else if (k==2){
             System.out.println("HELLO");
        }
        else {
            System.out.println("HI");

        }
            */




        switch (k) {
            case 1:System.out.println("ASSALAM-O-ALLEKUM");
                
                break;
            case 2 : System.out.println("HELLO");
                break;
            case 3 : System.out.println("hi");
                break;
        
            default: System.out.println("INVALID INPUT");
                break;
        }


    }
    
}
