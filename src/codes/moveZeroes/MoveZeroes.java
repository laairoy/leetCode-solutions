package codes.moveZeroes;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int length = nums.length;

        int[] temp = new int[length];

        int a = 0;

        for (int num : nums) {
            if (num != 0) {
                temp[a++] = num;
            }
        }

        for(int i = 0; i < a; i++) {
            nums[i] = temp[i];
        }

        for(int i = a; i < length; i++){
            nums[i] = 0;
        }
    }
}
