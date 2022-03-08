package codes.reverseString;

import java.util.Collections;

public class ReverseString {
    public void reverseString(char[] s){
        int count = s.length - 1;

        for(int i = 0; i < s.length / 2; i++){
            char c = s[i];
            s[i] = s[count-i];
            s[count-i] = c;
        }

        System.out.println(s);
    }
}
