class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (!set.contains(nums1[i])) {
                set.add(nums1[i]);
            }
        }

        for (int j = 0; j < nums2.length; j++) {
            if (!set.contains(nums2[j])) {
                continue;
            } else {
                set.remove(nums2[j]);
                result[index] = nums2[j];
                index++;
            }
        }

        return Arrays.copyOf(result, index);
    }
}