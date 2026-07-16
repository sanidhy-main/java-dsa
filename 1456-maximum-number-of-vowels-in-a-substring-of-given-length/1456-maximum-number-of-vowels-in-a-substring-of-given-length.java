class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int right = left + k;
        int count = 0;
        int maxCount = Integer.MIN_VALUE;

        for (int x = 0; x < right; x++) {
            if (s.charAt(x) == 'a' || s.charAt(x) == 'e' || s.charAt(x) == 'i' || s.charAt(x) == 'o' || s.charAt(x) == 'u') {
                count++;
            }
        }

        maxCount = Math.max(count, maxCount);

        while (left < right && right < s.length()) {
            if (s.charAt(left) == 'a' || s.charAt(left) == 'e' || s.charAt(left) == 'i' || s.charAt(left) == 'o' || s.charAt(left) == 'u') {
                count--;
            }

            left++;

            if (s.charAt(right) == 'a' || s.charAt(right) == 'e' || s.charAt(right) == 'i' || s.charAt(right) == 'o' || s.charAt(right) == 'u') {
                count++;
            }

            right++;

            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }
}