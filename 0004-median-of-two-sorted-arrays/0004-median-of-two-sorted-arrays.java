class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m + n];
        double median = 0;

        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }

        for (int j = 0; j < n; j++) {
            merged[m + j] = nums2[j];
        }

        Arrays.sort(merged);

        if ((m + n) % 2 != 0) {
            median = merged[((m + n + 1) / 2) - 1];
        } else {
            median = (merged[((m + n) / 2) - 1] + merged[((m + n) / 2)])/2.0;
        }

        return median;
    }
}