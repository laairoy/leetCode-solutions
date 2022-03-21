package codes.arithmeticProgression;

import java.util.Arrays;

/**
 * @author Laairoy
 * link: https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
 */
public class ArithmeticProgression {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        for (int i = 1; i < arr.length - 1; i += 2) {
            if ((arr[i - 1] + arr[i + 1]) / 2 != arr[i]) {
                return false;
            }
        }

        return true;
    }
}
