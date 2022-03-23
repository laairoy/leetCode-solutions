package codes.isItStraightLine;

/**
 * @author laairoy
 * link: https://leetcode.com/problems/check-if-it-is-a-straight-line/
 */
public class IsItStraightLine {
    public boolean checkStraightLine(int[][] coord) {
        for (int i = 2; i < coord.length; i++) {
            if (!check(coord[i-2],coord[i-1], coord[i])) {
               return false;
            }
        }
        return true;
    }

    public boolean check(int[] c1, int[] c2, int[] c3) {
        return (c3[0] - c2[0]) * (c1[1] - c3[1]) == (c1[0] - c3[0]) * (c3[1] - c2[1]);
    }
}
