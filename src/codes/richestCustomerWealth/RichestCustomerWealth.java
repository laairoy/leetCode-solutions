package codes.richestCustomerWealth;

/**
 * @author Laairoy
 * link: https://leetcode.com/problems/richest-customer-wealth/
 */
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int[] customer : accounts) {
            int sum = 0;
            for (int wealth : customer) {
                sum += wealth;
            }
            if (sum > max) max = sum;
        }
        return max;
    }
}
