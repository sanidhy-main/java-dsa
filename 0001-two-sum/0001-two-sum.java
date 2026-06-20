class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        while (left < nums.length) {
            if (map.containsKey(target - nums[left])) {
                int index1 = left;
                int index2 = map.get(target-nums[left]);

                result[0] = index1;
                result[1] = index2;

                return result;
            } else {
                map.put(nums[left], left);
                left++;
            }
        }
        return result;
    }
}