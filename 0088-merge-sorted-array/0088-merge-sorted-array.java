class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int index = nums1.length - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[index] = nums1[i];
                index--;
                i--;
            } else if (nums2[j] >= nums1[i]) {
                nums1[index] = nums2[j];
                index--;
                j--;
            }
        }

        for (int x = j; j >= 0; j--) {
            nums1[index] = nums2[j];
            index--;
        }
    }
}