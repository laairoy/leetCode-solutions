package codes.longestSubstring;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int longestSize = 0;

        Map<Character, Integer> map = new HashMap<>();
        int pivot = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(map.containsKey(c) && map.get(c) >= pivot) {
                longestSize = Math.max(longestSize, i - pivot);

                pivot = map.get(c) + 1;
            }

            map.put(s.charAt(i), i);
        }


        return Math.max(longestSize, s.length()-pivot);
    }
}
