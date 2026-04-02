class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 1;

        HashSet<Character> set = new HashSet<>();

        if (s.length() == 0) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            } else {
                while (set.contains(s.charAt(i))) {
                    set.remove(s.charAt(left));
                    left++;
                }

                set.add(s.charAt(i));
            }

            max = Math.max(max, i - left + 1);
        }

        return max;
    }
}