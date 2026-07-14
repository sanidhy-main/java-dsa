class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int num : set) {
            int count = 1;
            int x = 1;

            if (set.contains(num - 1)) {
                continue;
            } else {
                while (set.contains(num + x)) {
                    count++;
                    x++;
                }

                max = Integer.max(count, max);
            }
        }

        return max;
    }
}