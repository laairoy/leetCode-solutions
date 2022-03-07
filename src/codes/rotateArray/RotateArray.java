package codes.rotateArray;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] tempArray = new int[k];

        int a = 0;

        for (int i = nums.length - k; i < nums.length; i++) {
            tempArray[a++] = nums[i];
        }

        for (int i = nums.length-k-1; i >= 0 ; i--) {
            nums[i+k] = nums[i];
        }

        for(int i = 0; i < k; i++) {
            nums[i] = tempArray[i];
        }

    }
}
