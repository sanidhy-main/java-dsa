class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int middle = 1;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (left = 0; left < nums.length - 2; left++) {
            if (left > 0 && nums[left] == nums[left-1]) {
                continue;
            }

            middle = left+1;
            right = nums.length - 1;

            while (middle < right) {
                if (nums[left] + nums[middle] + nums[right] < 0) {
                    middle++;
                } else if (nums[left] + nums[middle] + nums[right] > 0) {
                    right--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[left]);
                    list.add(nums[middle]);
                    list.add(nums[right]);

                    result.add(list);

                    middle++;
                    while (middle < right && nums[middle] == nums[middle-1]) {
                        middle++;
                    }

                    right--;
                    while (middle < right && nums[right] == nums[right+1]) {
                    right--;
                    }
                }
            }
        }

        return result;
    }
}