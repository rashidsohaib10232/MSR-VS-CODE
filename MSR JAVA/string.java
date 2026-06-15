import java.util.*;
public class string {
    public static void main(String args[]){

        String fname = "Sohaib";
        String lname = "Rashid";
        String fullname = fname+" "+lname;
        System.out.println(fullname);


        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String rm = a + b;
        System.out.println(rm.length());

        //charAt
        for(int i =0; i<rm.length(); i++){

            System.out.println(rm.charAt(i));
        }

        if(a.equals(b)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

        if(a.compareTo(b)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

    }
}