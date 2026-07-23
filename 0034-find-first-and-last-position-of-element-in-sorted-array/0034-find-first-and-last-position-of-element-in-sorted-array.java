class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int left = 0;
        int right = nums.length - 1;
        int middle = left + (right - left)/2;
        int answer = -1;

        while (left <= right) {
            middle = left + (right - left)/2;

            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                answer = middle;
                right = middle - 1;
            }
        }

        result[0] = answer;

        left = 0;
        right = nums.length - 1;
        middle = left + (right - left)/2;
        answer = -1;

        while (left <= right) {
            middle = left + (right - left)/2;

            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                answer = middle;
                left = middle + 1;
            }
        }

        result[1] = answer;

        return result;
    }
}