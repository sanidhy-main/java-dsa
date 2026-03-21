class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> sol = new ArrayList<>();

        int ptrA = 0;
        int ptrL = 1;
        int ptrR = nums.length - 1;

        for (ptrA = 0;  ptrA < nums.length - 2; ptrA++) {
            if (ptrA > 0 && nums[ptrA] == nums[ptrA - 1]) {
                continue;
            }

            ptrL = ptrA + 1;
            ptrR = nums.length - 1;

        while (ptrL < ptrR) {
            if (nums[ptrL] + nums[ptrR] + nums[ptrA] > 0) {
                ptrR--;
            } else if (nums[ptrL] + nums[ptrR] + nums[ptrA] < 0) {
                ptrL++;
            } else {
                sol.add(Arrays.asList(nums[ptrA], nums[ptrL], nums[ptrR]));

                while (ptrL < ptrR && nums[ptrL] == nums[ptrL + 1]) {
                    ptrL++;
                }

                while (ptrL < ptrR && nums[ptrR] == nums[ptrR - 1]) {
                    ptrR--;
                }

                ptrL++;
                ptrR--;
            }
        }
        }
        
        return sol;
    }
}
