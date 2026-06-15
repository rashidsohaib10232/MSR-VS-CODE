import java.util.*;
public class MostFreqChar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int [] freq = new int[26];
        
       int maxCount = 0;
       char maxChar = ' ';

       for(int i =0; i<s.length(); i++){
        freq[s.charAt(i)-'a']++;

       }
       for(int i =0; i<26;i++){
        if(freq[i]>maxCount){
            maxCount=freq[i];
            maxChar = (char)('a'+i);
        }
       }

       System.out.println(maxChar+" "+maxCount);

    }
}
