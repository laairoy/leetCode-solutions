package codes.signProductArray;

public class SignProductArray {
    public int arraySign(int[] nums) {
        int countNegative = 0;

        for (int num : nums) {
            if (num < 0) {
                countNegative++;
            } else if (num == 0) {
                return 0;
            }
        }

        return countNegative % 2 == 0 ? 1 : -1;
    }
}
