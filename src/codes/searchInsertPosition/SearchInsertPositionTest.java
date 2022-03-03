package codes.searchInsertPosition;

public class SearchInsertPositionTest {
    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsertPosition.searchInsert(nums, 2));
    }
}
