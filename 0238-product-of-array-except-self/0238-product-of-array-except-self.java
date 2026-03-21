class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left = 1;
        int[] leftArray = new int[nums.length];

        int right = 1;
        int[] rightArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                leftArray[i] = 1;
            } else {
                left *= nums[i - 1];
                leftArray[i] = left;
            }
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            if (j == nums.length - 1) {
                rightArray[j] = 1;
            } else {
                right *= nums[j + 1];
                rightArray[j] = right;
            }
        }

        int[] sol = new int[nums.length];

        for (int k = 0; k < nums.length; k++) {
            sol[k] = leftArray[k] * rightArray[k];
        }

        return sol;
    }
}