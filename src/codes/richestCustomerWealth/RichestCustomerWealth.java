package codes.richestCustomerWealth;

/**
 * @author Laairoy
 * link: https://leetcode.com/problems/richest-customer-wealth/
 */
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        // Option 2
        int max = 0;

        for (int[] customer : accounts) {
            int sum = 0;
            for (int wealth : customer) {
                sum += wealth;
            }
            if (sum > max) max = sum;
        }

        return max;
        // Option 1 with Stream
//        return Arrays.stream(accounts)
//                .map(a -> Arrays.stream(a).sum())
//                .max(Integer::compare)
//                .get();
    }
}
