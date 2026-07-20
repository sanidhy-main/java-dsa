class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left)/2;

        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            }
        }

        while (mid <= right) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
                mid = left + (right - left)/2;
            } else {
                right = mid - 1;
                mid = left + (right - left)/2;
            }
        }

        return -1;
    }
}