import java.util.ArrayList;
import java.util.Collections;
public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(32);
        arr.add(34);
        arr.add(345);
        arr.add(-3);
        arr.add(13);

        System.out.println(arr);
        System.out.println(arr.get(5));
        System.out.println(arr.size());

        for(int i =0; i<arr.size(); i++){
            System.out.print(arr.get(i)+ " ");
         //   System.out.println(arr.get(i));
         //arr.add(99999);
        }

        System.out.println(arr);
        arr.add(999);
        
        // arr.add(0,1000);
        
        // arr.remove(0);
        
        // arr.remove(arr.size()-1);
        // System.out.println(arr);
        // arr.remove(arr.size()-1);
        // System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
        
    }
}
