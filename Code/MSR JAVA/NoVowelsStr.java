import java.util.*;
public class NoVowelsStr {
    public static void main(String[] args) {
        String s = "Beneath the endless sky where dreams collide with shadows, rivers whisper secrets to the mountains, stars paint silent hymns across the night, and every heartbeat becomes a verse of longing, hope, and eternal wonder.";
        int count = 0;
        int cons=0;
        int ch = s.length();
        for(int i = 0; i<ch; i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
            else{
                cons++;
            }
        } 
        
        System.out.println(count+" and " +cons);
    }
}
