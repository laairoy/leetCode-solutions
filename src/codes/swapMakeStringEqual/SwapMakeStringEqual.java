package codes.swapMakeStringEqual;

/**
 * @author Laairoy
 * link: https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
 */
public class SwapMakeStringEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        int collisions = 0;
        char[] check = null;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                if(check == null){
                    check = new char[]{c1[i], c2[i]};
                } else{
                    if(check[0] != c2[i] || check[1] != c1[i]){
                        return false;
                    }
                }

                collisions++;
            }
        }

        return collisions == 2 || collisions == 0;
    }

}
