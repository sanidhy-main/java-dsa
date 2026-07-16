class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int maxFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (right < s.length()) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            right++;

            for (int freq : map.values()) {
                maxFreq = Math.max(freq, maxFreq);
            }

            while (right - left - maxFreq > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;

                for (int freq : map.values()) {
                    maxFreq = Math.max(freq, maxFreq);
                }
            }

            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }
}