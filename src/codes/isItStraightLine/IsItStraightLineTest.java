package codes.isItStraightLine;

public class IsItStraightLineTest {
    public static void main(String[] args) {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        //int[][] coordinates = {{0,0},{0,1},{0,-1}};
        //int[][] coordinates = {{0,0}, {0,5},{5,5},{5,0}};
        System.out.println( new IsItStraightLine().checkStraightLine(coordinates));
    }
}
