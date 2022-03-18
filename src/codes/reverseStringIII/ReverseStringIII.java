package codes.reverseStringIII;

/**
 * @author Laairoy
 * link: https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseStringIII {
    public String reverseWords(String s) {

        String[] string = s.split(" ");

        StringBuilder temp = new StringBuilder();
        for(String w : string) {
           temp.append(new StringBuilder(w).reverse());
           temp.append(" ");
        }

        return temp.toString().trim();
    }
}
