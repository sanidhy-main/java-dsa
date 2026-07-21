class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        int result = 0;

        for (int p : piles) {
            right = Math.max(p, right);
        }

        int mid = left + (right - left) / 2;

        while (left <= right) {
            mid = left + (right - left) / 2;

            long timeNeeded = 0;

            for (int pile : piles) {
                if (pile <= mid) {
                    timeNeeded++;
                } else {
                    timeNeeded += ((long) pile + mid - 1) / mid;
                }
            }

            if (timeNeeded > h) {
                left = mid + 1;
            } else {
                result = mid;
                right = mid - 1;
            }
        }

        return result;
    }
}