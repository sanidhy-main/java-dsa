class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;
        int answer = 0;

        while (left < right) {
            mid = left + (right - left) / 2;

            if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else if (mid < nums.length - 1 && nums[mid] > nums[mid+1]) {
                right = mid;
            } else {
                return mid;
            }
        }

        return left;   
    }
}