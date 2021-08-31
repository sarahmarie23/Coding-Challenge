/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long left = 0;
		long right = n;
		while (left < right) {
			long mid = (left + right)/2;
		    boolean check = isBadVersion((int)mid);
		    if (check && !((isBadVersion((int)(mid-1))))) {
		        return (int) mid;
		    }
			if (!check) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return (int)left;
    }
}
