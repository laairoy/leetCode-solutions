package codes.numberOfOneBits;

public class NumberOfOneTest {
    public static void main(String[] args) {
        int n = 0b00000000000000000000000000001011;
        int n2 = 0b00000000000000000000000010000000;
        int n3 = 0b11111111111111111111111111111101;

        printResult(n);
        printResult(n2);
        printResult(n3);

    }

    public static void printResult(int n){
        System.out.println("Num: " + n);
        System.out.println("Count: " + new NumberOfOne().hammingWeight(n));
        System.out.println();
    }
}
