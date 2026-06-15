import java.util.*;
public class MostFreq2 {
    public static void main(String[] args) {
        String s = "aabbbcc";

        int freq[] = new int[26];

        for(int i =0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }

        int maxCount = 0;
        char maxChar = ' ';
        for(int i =0; i<26; i++){
            if(freq[i]>maxCount){
                maxCount = freq[i];
                maxChar =(char)('a'+i);
            }
        }
        System.out.println(maxChar + " " + maxCount);
        
    }
}
