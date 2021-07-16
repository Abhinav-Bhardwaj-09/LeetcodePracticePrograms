/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 16-07-2021
 * Time: 09:18
 */

public class FirstBadVersion_278 {
    /**/
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while (low < high) {
            int mid = low + (high-low)/2;
            if (isBadVersion(mid)) {
                high = mid;
                // return mid;

            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
    /**/
}
