package codes.sumOfSubarrays;

public class SumOfSubarraysTest {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        int[] arr2 = {10,11,12};
        int[] arr3 = {7,6,8,6};
        System.out.println(new SumOfSubarrays().sumOddLengthSubarrays(arr));
        System.out.println("-------");
        System.out.println(new SumOfSubarrays().sumOddLengthSubarrays(arr2));
        System.out.println("-------");
        System.out.println(new SumOfSubarrays().sumOddLengthSubarrays(arr3));
    }
}
