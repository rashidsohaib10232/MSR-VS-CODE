import java.util.ArrayList;
public class AddingOne {
    public static void main(String[] args) {
     ArrayList<Integer> arr = new ArrayList<>();
     arr.add(3);  
     arr.add(2);   
     arr.add(1);  
     arr.add(5);  
     System.out.println(arr);
     int n = arr.size();
     int l = arr.get(n-1);
     System.out.println(l);
    arr.set(n-1,l+1);
    System.out.println(arr);
  //  arr.add(0,0);
  //  System.out.println(arr);
    }
    
}
