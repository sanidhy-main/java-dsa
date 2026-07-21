class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left)/2;
        int index = -1;

        while (left <= right) {
            mid = left + (right - left)/2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                index = mid;
                right = mid - 1;
            }
        }

        result[0] = index;

        left = 0;
        right = nums.length - 1;
        mid = left + (right - left)/2;
        index = -1;

        while (left <= right) {
            mid = left + (right - left)/2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                index = mid;
                left = mid + 1;
            }
        }

        result[1] = index;

        return result;
    }
}