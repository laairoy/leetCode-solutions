package codes.countOddNumbers;

/**
 * @author Marden Laairoy
 * Link: https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
 */
public class CountOddNumbers {
    public int countOdds(int low, int high) {
        int temp = (high - low - 1) / 2;

        int lowRes = low % 2;
        int highRes = high % 2;

        if (lowRes == 1) temp++;
        if (highRes % 2 == 1 && low != high) temp++;
        if(lowRes == 0 && highRes == 0 && low != high) temp++;
        return temp;
    }
}
