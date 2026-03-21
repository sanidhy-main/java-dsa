class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int currentSum = 0;
        int previousPrefix;
        int[] prefix = new int[nums.length];
        int sub = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefix[i] = sum;
        }

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            previousPrefix = prefix[i];

            if (map.containsKey(currentSum - k)) {
                sub += map.get(currentSum - k);
            }
            
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
       
        return sub;
    }
}