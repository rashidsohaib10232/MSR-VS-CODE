import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String s = sc.nextLine();
        System.out.print("Enter any string : ");
        String t = sc.nextLine();

        int [] freq = new int[26];

        boolean isAnagram=true;

        for(int i =0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0; i<t.length(); i++){
            freq[t.charAt(i)-'a']--;
        }
        for(int i = 0; i<26; i++){
            if(freq[i] != 0){
                System.out.println("not anagram");
                isAnagram=false;
                break;
            }

            
        }
        if(isAnagram){
            System.out.println("anagram");
        }

    }
    
}
