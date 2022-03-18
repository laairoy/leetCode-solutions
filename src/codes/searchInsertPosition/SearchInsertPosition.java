package codes.searchInsertPosition;

/**
 * @author Laairoy
 * link: https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {
    private static int search(int[] nums, int begin, int end, int target) {

        int size = end - begin;

        if (size == 0) {
            return nums[nums.length-1] < target ? begin+1 : begin;
        }

        int split = size / 2;
        int pivot = begin + split;
        if (target > nums[pivot]) return search(nums, pivot + 1, end, target);
        return search(nums, begin, pivot, target);
    }

    public int searchInsert(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }
}
