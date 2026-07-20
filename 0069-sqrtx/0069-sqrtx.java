class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int mid = left + (right - left)/2;

        while (left <= right) {
            if ((long) mid * mid == x) {
                return mid;
            } else if ((long) mid * mid < x) {
                left = mid + 1;
                mid = left + (right - left)/2;
            } else {
                right = mid - 1;
                mid = left + (right - left)/2;
            }
        }

        return right;
    }
}