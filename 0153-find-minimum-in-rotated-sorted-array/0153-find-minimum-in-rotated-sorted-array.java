class Solution {
    public int findMin(int[] nums) {
        int mid = nums.length / 2;
        int right = nums.length - 1;
        int left  = 0;

        while (left < right) {
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }

            mid = (left + right) / 2;
        }

        return nums[left];
    }
}