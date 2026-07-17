class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double maxAvg = Integer.MIN_VALUE;

        int left = 0;
        int right = k;

        for (int i = 0; i < right; i++) {
            sum += nums[i];
        }

        maxAvg = Math.max(maxAvg, (double) sum/k);

        while (right < nums.length) {
            sum += nums[right];
            right++;

            sum -= nums[left];
            left++;

            maxAvg = Math.max(maxAvg, (double) sum/k);
        }

        return maxAvg;
    }
}