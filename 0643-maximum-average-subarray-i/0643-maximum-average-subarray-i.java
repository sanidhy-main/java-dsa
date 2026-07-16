class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = left + k;
        int sum = 0;
        double maxAvg = Integer.MIN_VALUE;

        for (int i = left; i < right; i++) {
            sum += nums[i];
        }

        maxAvg = Math.max((double) sum/k, maxAvg);

        while (right < nums.length) {
            sum -= nums[left];
            left++;

            sum += nums[right];
            right++;

            maxAvg = Math.max((double) sum/k, maxAvg);
        }

        return maxAvg;
    }
}