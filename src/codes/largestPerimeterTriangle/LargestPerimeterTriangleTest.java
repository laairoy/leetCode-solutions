package codes.largestPerimeterTriangle;

public class LargestPerimeterTriangleTest {
    public static void main(String[] args) {
        //int[] nums = {3, 2, 3, 4};
        //int[] nums = {1,2,1};
        int[] nums = {3,6,2,3};
        int res = new LargestPerimeterTriangle().largestPerimeter(nums);

        System.out.println(res);
    }
}
