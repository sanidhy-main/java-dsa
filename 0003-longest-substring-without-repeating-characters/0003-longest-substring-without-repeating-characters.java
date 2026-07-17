class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            while (right < s.length() && !set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
            }
            maxLen = Math.max(maxLen, right - left);

            while (right < s.length() && set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
                maxLen = Math.max(maxLen, right - left);
            }
        }

        return maxLen;
    }
}