class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left)/2;

        while (left <= right) {
            mid = left + (right - left)/2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                while (mid >= 0 && nums[mid] == target) {
                    mid--;
                }

                mid++;
                result[0] = mid;
                break;
            }
        }

        left = 0;
        right = nums.length - 1;
        mid = left + (right - left)/2;

        while (left <= right) {
            mid = left + (right - left)/2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                while (mid < nums.length && nums[mid] == target) {
                    mid++;
                }

                mid--;
                result[1] = mid;
                break;
            }
        }

        return result;
    }
}