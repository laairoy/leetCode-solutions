package codes.sumOfSubarrays;

/**
 * @author Laairoy
 * link: https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 */
public class SumOfSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int subsum = 0;
            for (int a = i; a >= 0; a--) {
                subsum += arr[a];
                if ((i - a) % 2 == 0) {
                    sum += subsum;
                }
            }
        }
        return sum;
    }
}
