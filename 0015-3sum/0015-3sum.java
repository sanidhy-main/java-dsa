class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int middle = 1;
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        while (left < nums.length - 2) {
            while (middle < right) {
                int sum = nums[left] + nums[right] + nums[middle];
                if (sum < 0) {
                    middle++;
                } else if (sum > 0) {
                    right--;
                } else if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[left]);
                    list.add(nums[middle]);
                    list.add(nums[right]);

                    result.add(list);

                    middle++;
                    while (middle < right && nums[middle] == nums[middle - 1]) {
                        middle++;
                    }

                    right--;
                    while (right > left && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }

            left++;
            while (left < middle && left > 0 && nums[left] == nums[left - 1]) {
                left++;
            }

            middle = left + 1;
            right = nums.length - 1;
        }

        return result;
    }
}