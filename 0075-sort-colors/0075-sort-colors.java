class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp1 = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp1;

                mid++;
                low++;
            } else if (nums[mid] == 2) {
                int temp2 = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp2;

                high--;
            } else {
                mid++;
            }
        }
    }
}