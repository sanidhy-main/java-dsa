class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int one = m-1;
        int two = n-1;
        int pos = m+n-1;

        while (one >= 0 && two >= 0) {
            if (nums1[one] > nums2[two]) {
                nums1[pos] = nums1[one];
                one--;
                pos--;
            } else {
                nums1[pos] = nums2[two];
                two--;
                pos--;
            }
        }

        while (pos >= 0 && two >= 0) {
            nums1[pos--] = nums2[two--];
        }
    }
}