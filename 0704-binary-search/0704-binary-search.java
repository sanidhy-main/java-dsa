class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int mid = left + (right - left) / 2;


        while (left <= right) {
            if (nums[mid] < target) {
                left = mid + 1;
                mid = left + (right - left) / 2;
            } else if (nums[mid] > target) {
                right = mid - 1;
                mid = left + (right - left) / 2;
            } else {
                return mid;
            }
        }

        return -1;
    }
}