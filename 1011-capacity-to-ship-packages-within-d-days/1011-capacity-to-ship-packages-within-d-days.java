class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        int result = 0;

        for (int w1 : weights) {
            left = Math.max(w1, left);
        }

        for (int w2 : weights) {
            right += w2;
        }

        int mid = left + (right - left) / 2;

        while (left <= right) {
            mid = left + (right - left) / 2;

            int daysNeeded = 1;
            int currentLoad = 0;

            for (int weight : weights) {
                if (currentLoad + weight <= mid) {
                    currentLoad += weight;
                } else {
                    daysNeeded++;
                    currentLoad = weight;
                }
            }

            if (daysNeeded > days) {
                left = mid + 1;
            } else {
                result = mid;
                right = mid - 1;
            }
        }

        return result;
    }
}