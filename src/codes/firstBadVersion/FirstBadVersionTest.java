package codes.firstBadVersion;

public class FirstBadVersionTest {
    public static void main(String[] args) {
        int n = 5;
        int bad = 4;

        FirstBadVersion firstBadVersion = new FirstBadVersion(bad);

        assert(bad == firstBadVersion.firstBadVersion(n));

    }
}
