import java.util.*;
public class string2 {
    public static void main(String arg []){

        StringBuilder sb = new StringBuilder("SOHAIB RASHID");
        System.out.println(sb);
        //char at index 0 
        System.out.println(sb.charAt(0));
        //set char at index 0
        sb.setCharAt(0,'p');
        System.out.println(sb);
        //insert
        sb.insert(0,'S');
        System.out.println(sb);

        //delete

        sb.delete(1, 2);
        System.out.println(sb);


        //append
        sb.append(" MSR ");
        System.out.println(sb.length());
    }
}
