class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int left = 0;
        int right = s1.length();

        HashMap<Character, Integer> freqMap = new HashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for (int j = left; j < right; j++) {
            freqMap.put(s2.charAt(j), freqMap.getOrDefault(s2.charAt(j), 0) + 1);
        }

        if (map.equals(freqMap)) {
            return true;
        }

        while (right < s2.length()) {
            freqMap.put(s2.charAt(right), freqMap.getOrDefault(s2.charAt(right), 0) + 1);
            right++;

            freqMap.put(s2.charAt(left), freqMap.get(s2.charAt(left)) - 1);

            if (freqMap.get(s2.charAt(left)) == 0) {
                freqMap.remove(s2.charAt(left));
            }

            left++;

            if (map.equals(freqMap)) {
                return true;
            }
        }

        return false;
    }
}