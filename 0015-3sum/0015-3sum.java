class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int left = 0;
        int middle = 1;
        int right = nums.length - 1;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            left = i;
            middle = left + 1;
            right = nums.length - 1;

            while (middle < right) {
                if (nums[left] + nums[middle] + nums[right] > 0) {
                    right--;
                } else if (nums[left] + nums[middle] + nums[right] < 0) {
                    middle++;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[left]);
                    list.add(nums[middle]);
                    list.add(nums[right]);
                    
                    result.add(list);

                    middle++;
                    right--;

                    while (middle < right && nums[middle] == nums[middle-1]) {
                        middle++;
                    }

                    while (right > left && nums[right] == nums[right+1]) {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}