package codes.moveZeroes;

import java.util.Arrays;

public class MoveZeroesTest {
    public static void main(String[] args) {
        int[] input = {0, 1, 0, 3, 12};

        new MoveZeroes().moveZeroes(input);

        Arrays.stream(input).forEach(System.out::println);
    }
}
