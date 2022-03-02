package codes.binarySearch;

public class BinarySearchTest {
    public static void main(String[] args) {

        binaryTest(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4);
        binaryTest(new int[]{-1,0,3,5,9,12}, 2, -1);
    }


    private static void binaryTest(int[] input, int target, int expected) {
        int output = BinarySearch.search(input, target);

        System.out.println("output: " + output);

        assert(output == expected);
    }
}
