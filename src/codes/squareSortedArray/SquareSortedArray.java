package codes.squareSortedArray;

import java.util.Arrays;

/**
 * @author Laairoy
 * link: https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SquareSortedArray {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            nums[i] *= nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }

}
