package codes.rotateArray;

public class RotateArrayTest {
    public static void main(String[] args) {
        int[] entrada = {1, 2, 3, 4, 5, 6, 7};

        new RotateArray().rotate(entrada, 3);

        for(int num : entrada) {
            System.out.println(num);
        }
    }
}
