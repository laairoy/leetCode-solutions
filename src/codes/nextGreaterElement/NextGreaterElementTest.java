package codes.nextGreaterElement;

public class NextGreaterElementTest {
    public static void main(String[] args) {
        int[] n1 = {4,1,2};
        int[] n2 = {4,1,2,3,6};

        int[] res = new NextGreaterElement().nextGreaterElement(n1,n2);

        for (int n : res) {
            System.out.println(n);
        }
    }
}
