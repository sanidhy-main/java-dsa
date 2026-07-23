class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        int mid = left + (right - left)/2;

        long timeNeeded = 0;
        int answer = 0;

        for (int p : piles) {
            right = Math.max(p, right);
        }

        while (left <= right) {
            mid = left + (right - left)/2;
            timeNeeded = 0;

            for (int pile : piles) {
                if (pile > mid) {
                    timeNeeded += (pile + mid - 1) / mid;
                } else {
                    timeNeeded++;
                }
            }

            if (timeNeeded > h) {
                left = mid + 1;
            } else {
                answer = mid;
                right = mid - 1;
            }
        }

        return answer;
    }
}