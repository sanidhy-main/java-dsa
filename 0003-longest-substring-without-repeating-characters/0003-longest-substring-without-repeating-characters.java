class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int count = 0;
        int maxCount = 0;

        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                count++;
                right++;
            } else {
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                    count--;
                }
            }

            maxCount = Math.max(count, maxCount);
        }

        return maxCount;
    }
}