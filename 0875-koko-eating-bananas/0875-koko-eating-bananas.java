class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        int answer = 0;

        for (int p : piles) {
            right = Math.max(right, p);
        }

        int mid = left + (right - left) / 2;

        while (left <= right) {
            mid = left + (right - left) / 2;

            long hoursNeeded = 0;
            for (int pile : piles) {
                hoursNeeded += (pile + mid - 1)/mid;
            }

            if (hoursNeeded <= h) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }
}