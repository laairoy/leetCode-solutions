package codes.binarySearch;

/**
 * @author Laairoy
 * https://leetcode.com/problems/binary-search/
 */

public class BinarySearch {
    public static int search(int[] nums, int target) {

        return search(nums, 0, nums.length - 1, target);
    }

    private static int search(int[] nums, int begin, int end, int target) {

        int size = end - begin;

        if (size == 0) {
            if (nums[begin] == target) return begin;
            return -1;
        }

        int split = size / 2;
        int pivot = begin + split;
        if (target > nums[pivot]) return search(nums, pivot + 1, end, target);
        return search(nums, begin, pivot, target);
    }
}

