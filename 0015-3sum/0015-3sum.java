class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);

       List<List<Integer>> li = new ArrayList<>();

        for (int left = 0; left < nums.length - 2; left++) {
            int ptr1 = left + 1;
            int ptr2 = nums.length - 1;

            if (left > 0 && nums[left] == nums[left - 1]) {
                continue;
            }

            while (ptr1 < ptr2) {
                if (nums[left] + nums[ptr1] + nums[ptr2] == 0) {
                    List<Integer> result = new ArrayList<>();

                    result.add(nums[left]);
                    result.add(nums[ptr1]);
                    result.add(nums[ptr2]);

                    li.add(result);

                    ptr1++;
                    ptr2--;

                    while (ptr1 < ptr2 && nums[ptr1] == nums[ptr1 - 1]) {
                        ptr1++;
                    }

                    while (ptr1 < ptr2 && nums[ptr2] == nums[ptr2 + 1]) {
                        ptr2--;
                    }

                } else if (nums[left] + nums[ptr1] + nums[ptr2] < 0) {
                    ptr1++;
                } else if (nums[left] + nums[ptr1] + nums[ptr2] > 0) {
                    ptr2--;
                }
            }
        }
        return li;
    }
}
