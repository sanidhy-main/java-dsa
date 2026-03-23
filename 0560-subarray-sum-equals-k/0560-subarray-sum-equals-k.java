class Solution {
    public int subarraySum(int[] nums, int k) {
        int subArrays = 0;
        int[] prefix = new int[nums.length];
        int currentSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            prefix[i] = currentSum;
        }

        for (int j = 0; j < nums.length; j++) {
            if (prefix[j] == k) {
                subArrays++;
            }

            if (map.containsKey(prefix[j] - k)) {
                subArrays += map.get(prefix[j] - k);
            } 
            
            if (map.containsKey(prefix[j])) {
                map.put(prefix[j], map.get(prefix[j]) + 1);
            } else {
                map.put(prefix[j], 1);
            }
        }

        return subArrays;
    }
}