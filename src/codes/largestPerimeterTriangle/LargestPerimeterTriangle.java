package codes.largestPerimeterTriangle;

import java.util.Arrays;

/**
 * @author Laairoy
 * link: https://leetcode.com/problems/largest-perimeter-triangle/
 */
public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 1] + nums[i - 2] > nums[i]) {
                return nums[i - 1] + nums[i - 2] + nums[i];
            }
        }

        return 0;
    }
}
