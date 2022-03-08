package codes.twoSumII;

import java.util.Arrays;

public class TwoSumIITest {
    public static void main(String[] args) {
        int[] input = {5, 25, 75};
        int target = 100;

        int[] result = new TwoSumII().twoSum(input, target);
        Arrays.stream(result).forEach(System.out::println);
    }
}
