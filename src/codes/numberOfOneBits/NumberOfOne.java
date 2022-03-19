package codes.numberOfOneBits;

/**
 * @author Laairoy
 * link: https://leetcode.com/problems/number-of-1-bits/
 */
public class NumberOfOne {
    public int hammingWeight(int n) {
        // opcao 3 (Algoritmo de contagem de bits (Brian Kernighan))
        // https://iq.opengenus.org/brian-kernighan-algorithm/
        int count = 0;
        while(n != 0){
            count++;
            n &= n-1;
        }
        return count;

        // Opcao 2
//        int count = 0;
//        long i;
//        for (i = Integer.toUnsignedLong(n); i > 1; i = i / 2) {
//            if (i % 2 == 1) {
//                count++;
//            }
//        }
//
//        if (i == 1) count++;
//        return count ;

        // Opcao 1
//        return (int) Stream.of(Integer.toBinaryString(n).split(""))
//                .filter(s -> s.equals("1"))
//                .count();

    }
}
