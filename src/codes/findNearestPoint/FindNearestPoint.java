package codes.findNearestPoint;

/**
 * @author Laairoy
 * link: https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
 */
public class FindNearestPoint {
    public int nearestValidPoint(int x, int y, int[][] points) {

        int min = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < points.length; i++) {
            int dx = x - points[i][0];
            int dy = y - points[i][1];

            if (dx * dy == 0) {
                int dist = Math.abs(dx - dy);

                if (dist < min) {
                    min = dist;
                    index = i;
                }
            }
        }

        return index;
    }
}
