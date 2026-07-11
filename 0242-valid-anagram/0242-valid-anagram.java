class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int j = 0; j < t.length(); j++) {
            sMap.put(t.charAt(j), sMap.getOrDefault(t.charAt(j), 0) - 1);
        }

        for (int count : sMap.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}