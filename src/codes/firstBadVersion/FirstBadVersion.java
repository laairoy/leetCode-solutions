package codes.firstBadVersion;

import java.util.HashMap;
import java.util.Map;

/**
 * @author laairoy
 *
 * https://leetcode.com/problems/first-bad-version/
 */

public class FirstBadVersion {

    private final int bad;

    public FirstBadVersion(int bad) {
        this.bad = bad;
    }

    public int firstBadVersion(int n) {
        int begin = 1;
        int end = n;

        while ((end - begin) > 0){
            int split = begin + (end-begin)/2;
            if(!isBadVersion(split)) {
                begin = split+1;
            } else {
                end = split;
            }
        }
        return end;
    }

    private boolean isBadVersion(int n){
        return (n >= bad);
    }
}
