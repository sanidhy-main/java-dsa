class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (currentSum + nums[i] < nums[i]) {
                currentSum = nums[i];
            } else {
                currentSum += nums[i];
            }

            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}