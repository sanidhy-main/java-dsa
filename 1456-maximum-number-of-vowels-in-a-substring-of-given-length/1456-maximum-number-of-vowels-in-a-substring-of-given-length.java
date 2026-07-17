class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int right = k;
        int maxLen = 0;
        int count = 0;

        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        for (int i = 0; i < right; i++) {
            if (set.contains(s.charAt(i))) {
                count++;
            }
        }

        maxLen = Math.max(maxLen, count);

        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                count++;
            }

            right++;

            if (set.contains(s.charAt(left))) {
                count--;
            }

            left++;

            maxLen = Math.max(maxLen, count);
        }

        return maxLen;
    }
}