package codes.squareSortedArray;

import java.util.Arrays;

public class SquareSortedArrayTest {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};

        SquareSortedArray squareSortedArray = new SquareSortedArray();

        int[] result = squareSortedArray.sortedSquares(nums);

        for(int i : nums) System.out.println(i);
    }
}
