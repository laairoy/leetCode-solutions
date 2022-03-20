package codes.findNearestPoint;

public class FindNearestPointTest {
    public static void main(String[] args) {
       int i = new FindNearestPoint().nearestValidPoint(3,4, new int[][] {{1,2}, {3,1}, {2,4}, {2,3}, {4,4}});
        System.out.println(i);
    }
}
