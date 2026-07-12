class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 1;
        int current = 0;
        int max = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if (set.contains(num - 1)) {
                continue;
            } else {
                count = 1;
                current = num;
                while (current < Integer.MAX_VALUE && set.contains(current + 1)) {
                    current++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}