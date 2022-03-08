package codes.twoSumII;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            result[0] = i + 1;
            result[1] = j + 1;

            int tempNum = numbers[i] + numbers[j];

            if (tempNum == target) {
                break;
            }
            if (tempNum < target) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }

}
