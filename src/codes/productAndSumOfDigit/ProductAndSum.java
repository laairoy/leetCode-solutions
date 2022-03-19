package codes.productAndSumOfDigit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Laairoy
 * link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */
public class ProductAndSum {
    public int subtractProductAndSum(int n){
        // opcao 3 (Mais rápido)
        int product = 1;
        int sum = 0;
        for( ; n > 0; n /= 10){
            int num = n % 10;
            product *= num;
            sum += num;
        }
        return product - sum;


        // Opcao 2
//        String[] nums = Integer.toString(n).split("");
//        int product = 1;
//        int sum = 0;
//        for(String num : nums){
//            int numInt = Integer.parseInt(num);
//            sum += numInt;
//            product *= numInt;
//        }
//        return product - sum;

        // Opcao 1
//        List<Integer> nums =  Arrays.stream(Integer.toString(n).split(""))
//                .map(Integer::parseInt).collect(Collectors.toList());
//
//        return nums.stream().reduce((a,b) -> a*b).get() - nums.stream().reduce(Integer::sum).get();
    }
}
