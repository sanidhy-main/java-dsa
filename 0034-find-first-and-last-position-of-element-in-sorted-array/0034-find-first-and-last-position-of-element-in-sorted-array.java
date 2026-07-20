class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left)/2;

        while (left <= right) {
            mid = left + (right - left)/2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                while (mid >= 0 && nums[mid] == target) {
                    mid--;
                }

                int index1 = mid + 1;
                mid++;

                while (mid < nums.length && nums[mid] == target) {
                    mid++;
                }

                int index2 = mid - 1;

                result[0] = index1;
                result[1] = index2;

                break;
            }
        }

        return result;
    }
}