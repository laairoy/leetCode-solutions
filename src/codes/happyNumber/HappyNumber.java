package codes.happyNumber;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Laairoy
 * link: https://leetcode.com/problems/happy-number/
 */
public class HappyNumber {
    int[] numbers = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81};

    public boolean isHappy(int number) {
        Set<Integer> set = new HashSet<>();

        while (set.add(number)) {
            number = calc(number);

            if (number == 1) {
                return true;
            }
        }
        return false;
    }

    private int calc(int number) {
        int sum = 0;

        while (number > 0) {
            sum += numbers[number % 10];
            number /= 10;
        }

        return sum;
    }
}
